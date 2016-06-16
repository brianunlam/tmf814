package emsSession;


/**
* emsSession/EmsSession_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from emsSession.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/


/** 
   * <p>A handle to an instance of this interface is gained via the
   * emsSessionInterface parameter of the getEmsSession()
   * operation in EmsSessionFactory_I.</p>
   */
public interface EmsSession_IOperations  extends session.Session_IOperations
{

  /**
     * <p>This allows an NMS to request the manager interfaces that the EMS 
     * implements</p>
     * <br>supportedManagerList: The list of manager names supported
     * by the EMS in the form <i>::managerName_T </i>
     * where <i>::managerName_T </i> is one of the following defined manager 
     * strings
     * <ol>
     * <li> "EMS" (mandatory)
     * <li> "ManagedElement" (mandatory)
     * <li> "MultiLayerSubnetwork" (mandatory)
     * <li> "TrafficDescriptor"
     * <li> "PerformanceManagement"
     * <li> "Protection"
     * <li> "EquipmentInventory"
     * <li> "Maintenance"
     * <li> "softwareAndDataManager"
     * <li> "transmissionDescriptor"
     * <li> "GuiCutThrough" (mandatory)
     * <li> "FlowDomain"         
     * <li> "MultiLayerSNPPLink"
     * <li> "TrafficConditioningProfile"
     * <li> "MLSNPP"  
     * </ol>
     * Additional managerName strings can be defined without changing this IDL.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of a non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request, 
     * and cannot determine the reason it could not comply, 
     * it may raise this exception. <br>
     * EXCPT_ACCESS_DENIED  - Raised in case of security violation<br><br>
     **/
  void getSupportedManagers (emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This allows an NMS to gain access to the specified manager 
     * interface without using the OMG Naming Service.</p>
     *
     * <br>managerName: The class or type of manager object that the client 
     * wants to access (see getSupportedManagers()). 
     * <br>managerInterface: The actual object returned will implement the 
     * specified manager interface.  However it is returned as a 
     * Common_I object so that this operation can be generic.  The client should 
     * narrow the returned object to the correct object type.
     * 
     * <p>Attempting to gain access to the following manager interfaces
     * may <u>not</u> raise EXCPT_NOT_IMPLEMENTED:<br>
     * EMS<br>
     * ManagedElement<br>
     * MultiLayerSubnetwork<br>
     * GuiCutThrough</p>
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of a non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request, 
     * and cannot determine the reason it could not comply, 
     * it may raise this exception. <br>
     * EXCPT_ACCESS_DENIED  - Raised in case of security violation<br><br>
     **/
  void getManager (String managerName, common.Common_IHolder managerInterface) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation allows an NMS to gain access to the event channel to 
     * receive notifications. It returns a reference to a NotifyChannel 
     * interface (which is an EventChannel).When the EMS supports the OMG Telecom 
     * Log service, this operation will return a reference to a NotifyLog 
     * interface (which is a NotifyChannel).</p>
     *
     * <br>CosNotifyChannelAdmin::EventChannel eventChannel: The event channel 
     * (NotifyChannel or NotifyLog) to be used by the NMS.
     * 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of a non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request, 
     * and cannot determine the reason it could not comply, 
     * it may raise this exception. <br>
     * EXCPT_ACCESS_DENIED - Raised in case of security violation<br><br>
     **/
  void getEventChannel (CosNotifyChannelAdmin.EventChannelHolder eventChannel) throws globaldefs.ProcessingFailureException;
} // interface EmsSession_IOperations