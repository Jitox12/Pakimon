package Pakimon.Def.dao;

import Pakimon.Def.dto.PokemonDto.PokemonRequestDto;
import Pakimon.Def.entities.*;
import Pakimon.Def.repositories.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonDaoImpl implements PokemonDao {

    private final PokemonRepository pokemonRepository;
    private final ElementRepository elementRepository;
    private final SkillRepository skillRepository;
    private final AbilityRepository abilityRepository;

    private final PokemonAbilityRepository pokemonAbilityRepository;
    private final PokemonElementRepository pokemonElementRepository;
    private final PokemonSkillRepository pokemonSkillRepository;


    public PokemonDaoImpl(PokemonRepository pokemonRepository,
                          ElementRepository elementRepository, PokemonAbilityRepository pokemonAbilityRepository,
                          PokemonElementRepository pokemonElementRepository, SkillRepository skillRepository, AbilityRepository abilityRepository, PokemonSkillRepository pokemonSkillRepository) {
        this.pokemonRepository = pokemonRepository;
        this.elementRepository = elementRepository;
        this.pokemonAbilityRepository = pokemonAbilityRepository;
        this.pokemonElementRepository = pokemonElementRepository;
        this.skillRepository = skillRepository;
        this.abilityRepository = abilityRepository;
        this.pokemonSkillRepository = pokemonSkillRepository;
    }

    @Override
    public PokemonEntity findPokemonByIdDao(Integer pokemonId) {
        return pokemonRepository.findByPokemonId(pokemonId);
    }

    @Override
    public List<PokemonEntity> getPokemonListDao() {
        return pokemonRepository.findAll();
    }

    @Override
    public void createPokemonDao(PokemonEntity pokemonEntity, PokemonRequestDto pokemonRequestDto) {

        PokemonEntity pokemon = pokemonRepository.save(pokemonEntity);

        List<PokemonElementEntity> pokemonElementList = createPokemonElementEntity(pokemon, pokemonRequestDto.getElementIdDto());
        List<PokemonSkillEntity> pokemonSkillList = createPokemonSkillEntity(pokemon, pokemonRequestDto.getSkillIdDto());
        List<PokemonAbilityEntity> pokemonAbilityEntityList = createPokemonAbilityEntity(pokemon, pokemonRequestDto.getAbilityIdDto());

        pokemonElementRepository.saveAll(pokemonElementList);
        pokemonSkillRepository.saveAll(pokemonSkillList);
        pokemonAbilityRepository.saveAll(pokemonAbilityEntityList);
    }

    @Override
    public void editPokemonDao(PokemonEntity pokemonEntity) {

        pokemonRepository.save(pokemonEntity);
    }

    private List<PokemonElementEntity> createPokemonElementEntity(PokemonEntity pokemonEntity, List<Integer> elementsId) {
        List<ElementEntity> elements = elementRepository.findByElementIdIn(elementsId);
        List<PokemonElementEntity> list = new ArrayList<>();

        elements.forEach((ElementEntity element) -> {
            list.add(PokemonElementEntity.builder().pokemonId(pokemonEntity).elementId(element).build());
        });

        return list;
    }

    private List<PokemonSkillEntity> createPokemonSkillEntity(PokemonEntity pokemonEntity, List<Integer> skillsId) {
        List<SkillEntity> skills = skillRepository.findBySkillIdIn(skillsId);
        List<PokemonSkillEntity> list = new ArrayList<>();

        skills.forEach((SkillEntity skill) -> {
            list.add(PokemonSkillEntity.builder().pokemonId(pokemonEntity).skillId(skill).build());
        });

        return list;
    }

    private List<PokemonAbilityEntity> createPokemonAbilityEntity(PokemonEntity pokemonEntity, List<Integer> abilitiesId) {
        List<AbilityEntity> abilities = abilityRepository.findByAbilityIdIn(abilitiesId);
        List<PokemonAbilityEntity> list = new ArrayList<>();

        abilities.forEach((AbilityEntity ability) -> {
            list.add(PokemonAbilityEntity.builder().pokemonId(pokemonEntity).abilityId(ability).build());
        });

        return list;
    }
}