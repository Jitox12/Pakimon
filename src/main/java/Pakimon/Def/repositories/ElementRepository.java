package Pakimon.Def.repositories;

import Pakimon.Def.entities.ElementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ElementRepository extends JpaRepository<ElementEntity, String> {

    ElementEntity findByElementId(Integer elementId);
    List<ElementEntity> findByElementIdIn(List<Integer> elementsId);
    List<ElementEntity> findAll();
}