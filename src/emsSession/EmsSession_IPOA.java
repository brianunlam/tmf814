package emsSession;


/**
* emsSession/EmsSession_IPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from emsSession.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/


/** 
   * <p>A handle to an instance of this interface is gained via the
   * emsSessionInterface parameter of the getEmsSession()
   * operation in EmsSessionFactory_I.</p>
   */
public abstract class EmsSession_IPOA extends org.omg.PortableServer.Servant
 implements emsSession.EmsSession_IOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getSupportedManagers", new java.lang.Integer (0));
    _methods.put ("getManager", new java.lang.Integer (1));
    _methods.put ("getEventChannel", new java.lang.Integer (2));
    _methods.put ("_get_associatedSession", new java.lang.Integer (3));
    _methods.put ("ping", new java.lang.Integer (4));
    _methods.put ("endSession", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
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
       case 0:  // emsSession/EmsSession_I/getSupportedManagers
       {
         try {
           emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList = new emsSession.EmsSession_IPackage.managerNames_THolder ();
           this.getSupportedManagers (supportedManagerList);
           out = $rh.createReply();
           emsSession.EmsSession_IPackage.managerNames_THelper.write (out, supportedManagerList.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


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
       case 1:  // emsSession/EmsSession_I/getManager
       {
         try {
           String managerName = in.read_string ();
           common.Common_IHolder managerInterface = new common.Common_IHolder ();
           this.getManager (managerName, managerInterface);
           out = $rh.createReply();
           common.Common_IHelper.write (out, managerInterface.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


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
       case 2:  // emsSession/EmsSession_I/getEventChannel
       {
         try {
           CosNotifyChannelAdmin.EventChannelHolder eventChannel = new CosNotifyChannelAdmin.EventChannelHolder ();
           this.getEventChannel (eventChannel);
           out = $rh.createReply();
           CosNotifyChannelAdmin.EventChannelHelper.write (out, eventChannel.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This attribute contains a reference to the Session_I on the other side 
     * (NMS/EMS)to which the object is associated.
     * This attribute can be checked to make sure the NmsSession_I/EmsSession_I 
     * association is still valid (in particular in case of communication 
     * failures).</p>
     **/
       case 3:  // session/Session_I/_get_associatedSession
       {
         session.Session_I $result = null;
         $result = this.associatedSession ();
         out = $rh.createReply();
         session.Session_IHelper.write (out, $result);
         break;
       }


  /**
     * <p> Allows for the detection of loss of communication.
     * It is implementation specific to differenciate intermittent 
     * problems from loss of connection.</p>
     **/
       case 4:  // session/Session_I/ping
       {
         this.ping ();
         out = $rh.createReply();
         break;
       }


  /**
     * <p> Allows for a controlled disconnect between parties.
     * All resources allocated for the session are deleted by operation.</p>
     **/
       case 5:  // session/Session_I/endSession
       {
         this.endSession ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:mtnm.tmforum.org/emsSession/EmsSession_I:1.0", 
    "IDL:mtnm.tmforum.org/session/Session_I:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public EmsSession_I _this() 
  {
    return EmsSession_IHelper.narrow(
    super._this_object());
  }

  public EmsSession_I _this(org.omg.CORBA.ORB orb) 
  {
    return EmsSession_IHelper.narrow(
    super._this_object(orb));
  }


} // class EmsSession_IPOA
