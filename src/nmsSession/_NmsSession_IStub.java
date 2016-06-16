package nmsSession;


/**
* nmsSession/_NmsSession_IStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from nmsSession.idl
* Wednesday, June 15, 2016 7:24:39 PM COT
*/


/** 
   * <p>This interface is instantiated at the NMS. The NMS passes
   * a handle to an instance of this interface in the client 
   * parameter of the emsSessionFactory::EmsSessionFactory_I::getEmsSession()
   * operation in EmsSessionFactory_I.</p>
   */
public class _NmsSession_IStub extends org.omg.CORBA.portable.ObjectImpl implements nmsSession.NmsSession_I
{


  /**
     * <p>When an EMS fails to push an event, it can notify all connected NMSs by 
     * invoking this method on every active NmsSession_I.  This method should also 
     * be invoked on any new NmsSession_I set up during the event loss period.</p>
     * 
     * <p>Once the EMS invokes this method on the NmsSession_Is, it sets an 
     * internal flag to indicate that it has already informed NMSes of event loss. 
     * As long as this flag is set, the EMS will not invoke this method again.</p>
     *
     * <p>When this method is invoked on an NmsSession_I, the NMS comes to know 
     * that the EMS has failed to push one or more events that may be of interest 
     * to it. The NMS should consider itself to be potentially out-of-sync with 
     * the EMS. It should wait until the EMS calls eventLossCleared before 
     * resynchronizing with the EMS.</p>
     *
     * <br>globaldefs::Time_T startTime: The time of the first notification lost.
     * <br>string notificationId: The notificationId of the first notification 
     * lost.
     **/
  public void eventLossOccurred (String startTime, String notificationId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eventLossOccurred", true);
                globaldefs.Time_THelper.write ($out, startTime);
                $out.write_string (notificationId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                eventLossOccurred (startTime, notificationId        );
            } finally {
                _releaseReply ($in);
            }
  } // eventLossOccurred


  /**
     * <p>The EMS invokes this method to indicate that the event or alarm loss 
     * period is over, and that it is now capable of providing relevant
     * notifications.</p>
     * 
     * <p>After invoking this method on the NmsSession_Is, the EMS clears the 
     * internal flag set by alarmLossOccured or/and eventLossOccurred.  If 
     * event or alarm loss occurs again, alarmLossOccurred or eventLossOccurred 
     * will be called.</p>
     *
     * <p>How and when the EMS decides to invoke eventLossCleared is an EMS 
     * implementation detail. The actual algorithm that the EMS uses may be as 
     * simple as a timer-based mechanism or a complicated one which monitors the 
     * current rate at which the EMS pushes events and the available resources in 
     * NOSE.</p>
     *
     * <br>globaldefs::Time_T endTime: The time of the end of the event loss 
     * period, as determined by the EMS.
     **/
  public void eventLossCleared (String endTime)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eventLossCleared", true);
                globaldefs.Time_THelper.write ($out, endTime);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                eventLossCleared (endTime        );
            } finally {
                _releaseReply ($in);
            }
  } // eventLossCleared


  /**
     * <p>When an EMS fails to discsrd an alarm, a TCA, a file transfer status or 
     * a protection switch notification, it can notify all connected NMSs 
     * by invoking this method on every active NmsSession_I.  This method 
     * should also be invoked on any new NmsSession_I set up during the event 
     * loss period.</p>
     * 
     * <p>Once the EMS invokes this method on the NmsSession_Is, it sets an 
     * internal flag to indicate that it has already informed NMSs of alarm
     * loss. As long as this flag is set, the EMS will not invoke this method
     * again. It however may invoke eventLossOccurred if it fails to push a 
     * different type of event. </p>
     *
     * <p>When this method is invoked on an NmsSession_I, the NMS comes to know 
     * that the EMS has failed to push one or more alarms, TCA, file transfer 
     * or protection switch notifications that may be of interest to it. The 
     * NMS should consider itself to be potentially out-of-sync with the EMS 
     * with respect to these types of notifications. It should wait until the
     * EMS calls eventLossCleared before resynchronizing on alarms, TCA, 
     * file transfer and protection switch data with the EMS.</p>
     *
     * <br>globaldefs::Time_T startTime: The time of the first notification lost.
     * <br>string notificationId: The notificationId of the first notification 
     * lost.
     **/
  public void alarmLossOccurred (String startTime, String notificationId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("alarmLossOccurred", true);
                globaldefs.Time_THelper.write ($out, startTime);
                $out.write_string (notificationId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                alarmLossOccurred (startTime, notificationId        );
            } finally {
                _releaseReply ($in);
            }
  } // alarmLossOccurred


  /**
     * <p>This attribute contains a reference to the Session_I on the other side 
     * (NMS/EMS)to which the object is associated.
     * This attribute can be checked to make sure the NmsSession_I/EmsSession_I 
     * association is still valid (in particular in case of communication 
     * failures).</p>
     **/
  public session.Session_I associatedSession ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_associatedSession", true);
                $in = _invoke ($out);
                session.Session_I $result = session.Session_IHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return associatedSession (        );
            } finally {
                _releaseReply ($in);
            }
  } // associatedSession


  /**
     * <p> Allows for the detection of loss of communication.
     * It is implementation specific to differenciate intermittent 
     * problems from loss of connection.</p>
     **/
  public void ping ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ping", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                ping (        );
            } finally {
                _releaseReply ($in);
            }
  } // ping


  /**
     * <p> Allows for a controlled disconnect between parties.
     * All resources allocated for the session are deleted by operation.</p>
     **/
  public void endSession ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("endSession", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                endSession (        );
            } finally {
                _releaseReply ($in);
            }
  } // endSession

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:mtnm.tmforum.org/nmsSession/NmsSession_I:1.0", 
    "IDL:mtnm.tmforum.org/session/Session_I:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _NmsSession_IStub