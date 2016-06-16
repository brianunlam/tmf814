package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/_EventChannelFactoryStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for the event channel factory.
    */
public class _EventChannelFactoryStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyChannelAdmin.EventChannelFactory
{


  /**
         * Create an event channel with specified quality of service.
         * @parm <code>initial_qos</code> - A list of name-value pair that
         * specify the desired quality of service settings for this event
         * channel.
         * @parm <code>initial_admin</code> - A list of name-value pair that
         * specify the desired administrative settings for this event channel.
         * @returns A new event channel object reference.
         * @raises UnsupportedQoS If any of the settings in the
         * <code>initial_qos</code> sequence could not be supported.
         * @raises UnsupportedAdmin If any of the settings in the
         * <code>initial_admin</code> sequence could not be supported.
         */
  public CosNotifyChannelAdmin.EventChannel create_channel (CosNotification.Property[] initial_qos, CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws CosNotification.UnsupportedQoS, CosNotification.UnsupportedAdmin
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("create_channel", true);
                CosNotification.QoSPropertiesHelper.write ($out, initial_qos);
                CosNotification.AdminPropertiesHelper.write ($out, initial_admin);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.EventChannel $result = CosNotifyChannelAdmin.EventChannelHelper.read ($in);
                id.value = CosNotifyChannelAdmin.ChannelIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
                    throw CosNotification.UnsupportedQoSHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotification/UnsupportedAdmin:1.0"))
                    throw CosNotification.UnsupportedAdminHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return create_channel (initial_qos, initial_admin, id        );
            } finally {
                _releaseReply ($in);
            }
  } // create_channel


  /**
         * Get all event channels created by this factory.
         * @returns A sequence of channel object unique identifiers.
         */
  public int[] get_all_channels ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_channels", true);
                $in = _invoke ($out);
                int $result[] = CosNotifyChannelAdmin.ChannelIDSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_channels (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_channels


  /**
         * Get an event channel object from its ID.
         * @parm <code>id</code> - A unique identifier for the channel object.
         * @returns An <code>EventChannel</code> object reference.
         * @raises ChannelNotFound If no channel object with that ID
         * could be found.
         */
  public CosNotifyChannelAdmin.EventChannel get_event_channel (int id) throws CosNotifyChannelAdmin.ChannelNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_event_channel", true);
                CosNotifyChannelAdmin.ChannelIDHelper.write ($out, id);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.EventChannel $result = CosNotifyChannelAdmin.EventChannelHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/ChannelNotFound:1.0"))
                    throw CosNotifyChannelAdmin.ChannelNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_event_channel (id        );
            } finally {
                _releaseReply ($in);
            }
  } // get_event_channel

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0"};

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
} // class _EventChannelFactoryStub