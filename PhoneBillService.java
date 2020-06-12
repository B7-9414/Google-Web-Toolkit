package edu.cau.cis301.Bassam.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.List;
import java.util.Map;


@RemoteServiceRelativePath("add")
public interface PhoneBillService extends RemoteService {
  public void add(String customer, PhoneCall call);

  public Map<String, PhoneBill> print();

  public List<PhoneCall> search(String customer, String startTime);

  PhoneBill getPhoneBill();

}