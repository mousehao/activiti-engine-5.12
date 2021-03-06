package org.activiti.bpmn.model;

import java.util.ArrayList;
import java.util.List;

public class Operation extends BaseElement {

  protected String name;
  protected String implementationRef;
  protected String inMessageRef;
  protected String outMessageRef;
  protected List<String> errorMessageRef = new ArrayList<String>();
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getImplementationRef() {
    return implementationRef;
  }
  public void setImplementationRef(String implementationRef) {
    this.implementationRef = implementationRef;
  }
  public String getInMessageRef() {
    return inMessageRef;
  }
  public void setInMessageRef(String inMessageRef) {
    this.inMessageRef = inMessageRef;
  }
  public String getOutMessageRef() {
    return outMessageRef;
  }
  public void setOutMessageRef(String outMessageRef) {
    this.outMessageRef = outMessageRef;
  }
  public List<String> getErrorMessageRef() {
    return errorMessageRef;
  }
  public void setErrorMessageRef(List<String> errorMessageRef) {
    this.errorMessageRef = errorMessageRef;
  }
}
