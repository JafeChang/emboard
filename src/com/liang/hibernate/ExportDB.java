package com.liang.hibernate;
 
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
 
/**
 * ��hbm����ddl
 * @author liang
 *
 */
public class ExportDB{  
    public static void main(String[]args){
        //Ĭ�϶�ȡhibernate.cfg.xml�ļ�
        Configuration cfg = new Configuration().configure();
        ////���ɲ����sql���ļ�����ǰĿ¼�������ݿ�
        SchemaExport export = new SchemaExport(cfg);
        export.create(true, true);
    }
}