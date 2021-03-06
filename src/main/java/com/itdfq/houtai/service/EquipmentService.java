package com.itdfq.houtai.service;

import com.itdfq.houtai.dao.EquipmentDao;
import com.itdfq.houtai.model.Equipment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DFQ on 2020/10/11 16:14
 */
@Service
public class EquipmentService  {
    @Resource
    private EquipmentDao equipmentDao;


    @Transactional
    public List<Equipment> findEquipment(String equipNo,String equipName) {
        return equipmentDao.select(equipNo,equipName);
    }


    public void insert(Equipment equipment) {
        equipment.setDelFlag("0");
        equipmentDao.insert(equipment);
    }


    public void update(Equipment equipment) {
            equipmentDao.update(equipment);
    }


    public void deleteById(int id) {
            equipmentDao.deleteById(id);
    }


    public List<Equipment> findPermission(int userId){
        return equipmentDao.selectPermission(userId);
    }

    public List<Equipment> findNoPermission(int userId){
        return equipmentDao.selectNoPermission(userId);
    }
}
