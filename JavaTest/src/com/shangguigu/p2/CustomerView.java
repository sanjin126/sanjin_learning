package com.shangguigu.p2;

/**
 *
 * 主模块，负责菜单的显示和处理用户操作
 *
 *
 */
public class CustomerView {
    public void enterMainMenu(){
        boolean isExit = false;
        while ( !isExit ){
            System.out.println("-----------------客户信息管理软件-----------------\n" +
                    "\n" +
                    "                   1 添 加 客 户\n" +
                    "                   2 修 改 客 户\n" +
                    "                   3 删 除 客 户\n" +
                    "                   4 客 户 列 表\n" +
                    "                   5 退       出\n" +
                    "\n" +
                    "                   请选择(1-5)：");
            char slt = CMUtility.readMenuSelection();
            switch (slt){
                case '1':
                    System.out.println("添加客户");
                    break;
                case '2':
                    System.out.println("修改客户");
                    break;
                case '3':
                    System.out.println("删除客户");
                    break;
                case '4':
                    System.out.println("客户列表");
                    break;
                case '5':
                    System.out.println("退出");
                    isExit = true;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new CustomerView().enterMainMenu();
    }
}
