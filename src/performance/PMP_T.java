package performance;


/**
* performance/PMP_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class PMP_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public performance.PMParameterWithThresholds_T pmParameterWithThresholdsList[] = null;
  public performance.AdministrativeState_T monitoringState = null;
  public performance.AdministrativeState_T supervisionState = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public PMP_T ()
  {
  } // ctor

  public PMP_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, performance.PMParameterWithThresholds_T[] _pmParameterWithThresholdsList, performance.AdministrativeState_T _monitoringState, performance.AdministrativeState_T _supervisionState, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    pmParameterWithThresholdsList = _pmParameterWithThresholdsList;
    monitoringState = _monitoringState;
    supervisionState = _supervisionState;
    additionalInfo = _additionalInfo;
  } // ctor

} // class PMP_T