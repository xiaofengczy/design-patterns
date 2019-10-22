package com.xiaofengczy.design.structural.strategy;

/**
 * @author caozhongyu
 * @FileName: MigrationStrategy
 * @Description: 迁移策略
 * @create 19-10-18
 */
public interface MigrationStrategy {

  void migrationForm();

  void saveStandard();

  void saveCheckList();

  void saveEquipmentAndFormRelation();

  void migrationHistory();

}
