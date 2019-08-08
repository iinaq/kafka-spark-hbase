package com.iinaq.boot;

import com.iinaq.boot.hbase.HBaseCreateTable;
import com.iinaq.boot.job.SparkStreamingFromKafkaToHBaseExample;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            outputHelp();
            return;
        }

        String command = args[0];
        String[] subArgs = new String[args.length - 1];

        System.arraycopy(args, 1, subArgs, 0, subArgs.length);

        if (command.equals("HBaseCreateTable")) {
            HBaseCreateTable.main(subArgs);
        } else if (command.equals("SparkStreamingFromKafkaToHBaseExample")) {
            SparkStreamingFromKafkaToHBaseExample.main(subArgs);
            //} else if (command.equals("SparkStreamingFromFlumeToHBaseWindowingExample")){
            //	SparkStreamingFromFlumeToHBaseWindowingExample.main(subArgs);
        } else {
            outputHelp();
        }
    }

    private static void outputHelp() {
        System.out.println("---");
        System.out.println("HBaseCreateTable");
        System.out.println("SparkStreamingFromKafkaToHBaseExample");
        //System.out.println("SparkStreamingFromFlumeToHBaseWindowingExample");
        System.out.println("---");
    }
}
