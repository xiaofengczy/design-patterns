package com.xiaofengczy.design.structural.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author caozhongyu
 * @FileName: MainTest
 * @Description:
 * @create 19-10-18
 */
public class MainTest {

  public static void main(String[] args) {

    List<MigrationBO> migrationBOS = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
      MigrationBO migrationBO = new MigrationBO();
      migrationBO.setNewVersion(i % 2 == 0 ? true : false);
      migrationBO.setMigrationData(new ArrayList<>());
      migrationBOS.add(migrationBO);
    }
    Map<Boolean, List<MigrationBO>> migrationMap = migrationBOS.stream()
        .collect(Collectors.groupingBy(MigrationBO::isNewVersion));

    migrationMap.entrySet().forEach(m -> {
      MigrationContent migrationContent;
      if (m.getKey()) {
        migrationContent = new MigrationContent(new CurrentVersionStrategy());
      } else {
        migrationContent = new MigrationContent(new HistoryVersionStrategy());
      }
      migrationContent.doMigration();
    });

  }

}
