package CosNotifyComm;


/**
* CosNotifyComm/StructuredPushConsumerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyComm.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for structured push consumers.
    */
public abstract class StructuredPushConsumerPOA extends org.omg.PortableServer.Servant
 implements CosNotifyComm.StructuredPushConsumerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("push_structured_event", new java.lang.Integer (0));
    _methods.put ("disconnect_structured_push_consumer", new java.lang.Integer (1));
    _methods.put ("offer_change", new java.lang.Integer (2));
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
         * Push a structured event onto this consumer.
         * @parm <code>notification</code> - The structured event.
         * @raises Disconnected If this consumer is disconnected.
         */
       case 0:  // CosNotifyComm/StructuredPushConsumer/push_structured_event
       {
         try {
           CosNotification.StructuredEvent notification = CosNotification.StructuredEventHelper.read (in);
           this.push_structured_event (notification);
           out = $rh.createReply();
         } catch (CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Disconnect this structured push consumer.
         */
       case 1:  // CosNotifyComm/StructuredPushConsumer/disconnect_structured_push_consumer
       {
         this.disconnect_structured_push_consumer ();
         out = $rh.createReply();
         break;
       }


  /**
         * Indicates that a supplier is changing the names of the types of
         * events it is publishing.
         * @parm <code>added</code> - The event types added.
         * @parm <code>removed</code> - The event types removed.
         * @raises InvalidEventType If any of the event type names in either 
         * the of the input sequences are invalid.
         */
       case 2:  // CosNotifyComm/NotifyPublish/offer_change
       {
         try {
           CosNotification.EventType added[] = CosNotification.EventTypeSeqHelper.read (in);
           CosNotification.EventType removed[] = CosNotification.EventTypeSeqHelper.read (in);
           this.offer_change (added, removed);
           out = $rh.createReply();
         } catch (CosNotifyComm.InvalidEventType $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyComm.InvalidEventTypeHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyComm/StructuredPushConsumer:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public StructuredPushConsumer _this() 
  {
    return StructuredPushConsumerHelper.narrow(
    super._this_object());
  }

  public StructuredPushConsumer _this(org.omg.CORBA.ORB orb) 
  {
    return StructuredPushConsumerHelper.narrow(
    super._this_object(orb));
  }


} // class StructuredPushConsumerPOA
