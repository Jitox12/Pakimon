package Pakimon.Def.services;

import Pakimon.Def.dao.SkillDao;
import Pakimon.Def.dto.skillDto.SkillRequestDto;
import Pakimon.Def.dto.skillDto.SkillResponseDto;
import Pakimon.Def.entities.SkillEntity;
import Pakimon.Def.mapper.skillMapper.SkillRequestMapper;
import Pakimon.Def.mapper.skillMapper.SkillResponseMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillService implements SkillServiceInterface {

    private final SkillRequestMapper skillRequestMapper;
    private final SkillResponseMapper skillResponseMapper;
    private final SkillDao skillDao;

    public SkillService(SkillRequestMapper skillRequestMapper, SkillResponseMapper skillResponseMapper, SkillDao skillDao) {
        this.skillRequestMapper = skillRequestMapper;
        this.skillResponseMapper = skillResponseMapper;
        this.skillDao = skillDao;
    }

    @Override
    public SkillResponseDto findSkillById(Integer skillId) {

        return skillResponseMapper.skillResponseMapper(skillDao.findSkillByIdDao(skillId));
    }

    @Override
    public List<SkillResponseDto> getSkillList() {

        List<SkillResponseDto> skillResponseDto = skillDao.getSkillListDao().stream().map(skillResponseMapper::skillResponseMapper).collect(Collectors.toList());

        return skillResponseDto;
    }

    @Override
    public void createSkill(SkillRequestDto skillRequestDto) {
        skillDao.createSkillDao(skillRequestMapper.skillRequestMapper(skillRequestDto));
    }

    @Override
    public void editSkill(Integer skill_id, SkillRequestDto skillRequestDto) {
        skillRequestDto.setSkillIdDto(skill_id);
        skillDao.editSkillDao(skillRequestMapper.skillRequestMapper(skillRequestDto));

    }

}
