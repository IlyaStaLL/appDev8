package com.example.workmanager1;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SubtractWorker extends Worker {
    public SubtractWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        int input = getInputData().getInt("input", 0);
        int result = input - 3;


        Data outputData = new Data.Builder().putInt("result", result).build();
        return Result.success(outputData);
    }
}