package edu.cau.cis301.Bassam.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.List;
import java.util.Map;


public interface PhoneBillServiceAsync {
    public void add(String customer ,PhoneCall call,AsyncCallback<Void> async);

    public void print(AsyncCallback<Map<String, PhoneBill>> async);

    public void search(String customer, String startTime,AsyncCallback<List<PhoneCall>>async);

    void getPhoneBill(AsyncCallback<PhoneBill> async);
}
