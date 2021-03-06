package DsLogAdmin;


/**
* DsLogAdmin/BasicLogFactoryPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public abstract class BasicLogFactoryPOA extends org.omg.PortableServer.Servant
 implements DsLogAdmin.BasicLogFactoryOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("create", new java.lang.Integer (0));
    _methods.put ("create_with_id", new java.lang.Integer (1));
    _methods.put ("list_logs", new java.lang.Integer (2));
    _methods.put ("find_log", new java.lang.Integer (3));
    _methods.put ("list_logs_by_id", new java.lang.Integer (4));
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
       case 0:  // DsLogAdmin/BasicLogFactory/create
       {
         try {
           short full_action = DsLogAdmin.LogFullActionTypeHelper.read (in);
           long max_size = in.read_ulonglong ();
           org.omg.CORBA.IntHolder id = new org.omg.CORBA.IntHolder ();
           DsLogAdmin.BasicLog $result = null;
           $result = this.create (full_action, max_size, id);
           out = $rh.createReply();
           DsLogAdmin.BasicLogHelper.write (out, $result);
           DsLogAdmin.LogIdHelper.write (out, id.value);
         } catch (DsLogAdmin.InvalidLogFullAction $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidLogFullActionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // DsLogAdmin/BasicLogFactory/create_with_id
       {
         try {
           int id = DsLogAdmin.LogIdHelper.read (in);
           short full_action = DsLogAdmin.LogFullActionTypeHelper.read (in);
           long max_size = in.read_ulonglong ();
           DsLogAdmin.BasicLog $result = null;
           $result = this.create_with_id (id, full_action, max_size);
           out = $rh.createReply();
           DsLogAdmin.BasicLogHelper.write (out, $result);
         } catch (DsLogAdmin.LogIdAlreadyExists $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.LogIdAlreadyExistsHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidLogFullAction $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidLogFullActionHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // DsLogAdmin/LogMgr/list_logs
       {
         DsLogAdmin.Log $result[] = null;
         $result = this.list_logs ();
         out = $rh.createReply();
         DsLogAdmin.LogListHelper.write (out, $result);
         break;
       }

       case 3:  // DsLogAdmin/LogMgr/find_log
       {
         int id = DsLogAdmin.LogIdHelper.read (in);
         DsLogAdmin.Log $result = null;
         $result = this.find_log (id);
         out = $rh.createReply();
         DsLogAdmin.LogHelper.write (out, $result);
         break;
       }

       case 4:  // DsLogAdmin/LogMgr/list_logs_by_id
       {
         int $result[] = null;
         $result = this.list_logs_by_id ();
         out = $rh.createReply();
         DsLogAdmin.LogIdListHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/DsLogAdmin/BasicLogFactory:1.0", 
    "IDL:omg.org/DsLogAdmin/LogMgr:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public BasicLogFactory _this() 
  {
    return BasicLogFactoryHelper.narrow(
    super._this_object());
  }

  public BasicLogFactory _this(org.omg.CORBA.ORB orb) 
  {
    return BasicLogFactoryHelper.narrow(
    super._this_object(orb));
  }


} // class BasicLogFactoryPOA
