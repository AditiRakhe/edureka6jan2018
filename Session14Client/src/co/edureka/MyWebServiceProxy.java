package co.edureka;

public class MyWebServiceProxy implements co.edureka.MyWebService {
  private String _endpoint = null;
  private co.edureka.MyWebService myWebService = null;
  
  public MyWebServiceProxy() {
    _initMyWebServiceProxy();
  }
  
  public MyWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyWebServiceProxy();
  }
  
  private void _initMyWebServiceProxy() {
    try {
      myWebService = (new co.edureka.MyWebServiceServiceLocator()).getMyWebService();
      if (myWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myWebService != null)
      ((javax.xml.rpc.Stub)myWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edureka.MyWebService getMyWebService() {
    if (myWebService == null)
      _initMyWebServiceProxy();
    return myWebService;
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (myWebService == null)
      _initMyWebServiceProxy();
    return myWebService.sayHello(name);
  }
  
  public int mtrToCm(int mtrs) throws java.rmi.RemoteException{
    if (myWebService == null)
      _initMyWebServiceProxy();
    return myWebService.mtrToCm(mtrs);
  }
  
  public java.lang.String registerEmployee(int eid, java.lang.String name, int salary) throws java.rmi.RemoteException{
    if (myWebService == null)
      _initMyWebServiceProxy();
    return myWebService.registerEmployee(eid, name, salary);
  }
  
  public int feetToInches(int feet) throws java.rmi.RemoteException{
    if (myWebService == null)
      _initMyWebServiceProxy();
    return myWebService.feetToInches(feet);
  }
  
  
}