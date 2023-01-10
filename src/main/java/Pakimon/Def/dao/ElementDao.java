package Pakimon.Def.dao;

import Pakimon.Def.entities.ElementEntity;

import java.util.List;

public interface ElementDao {
    public ElementEntity findElementByIdDao(Integer elementId);
    public List<ElementEntity> getElementListDao();
    public void createElementDao(ElementEntity elementEntity);
    public void editElementDao(ElementEntity elementEntity);
}
