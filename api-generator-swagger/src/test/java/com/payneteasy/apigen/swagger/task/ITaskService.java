package com.payneteasy.apigen.swagger.task;

import com.payneteasy.apigen.swagger.task.messages.ListTaskRequest;
import com.payneteasy.apigen.swagger.task.messages.ListTaskResponse;
import com.payneteasy.apigen.swagger.task.messages.SaveTaskRequest;
import com.payneteasy.apigen.swagger.task.messages.VoidResponse;

public interface ITaskService {

    ListTaskResponse listTasksMulti(ListTaskRequest aFirst, ListTaskRequest aSecond);

    ListTaskResponse multiArgs(long aFirst, String aSecond);

    ListTaskResponse listTasksNoArgs();

    ListTaskResponse listTasks(ListTaskRequest aRequest);

    VoidResponse saveTask(SaveTaskRequest aRequest);

    VoidResponse saveTaskArgs(long aTaskId, String aTaskName);

    void voidResponse();

}
