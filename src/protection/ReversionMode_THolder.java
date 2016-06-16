package protection;

/**
* protection/ReversionMode_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>Reversion mode is used to indicate whether, after repair of a
   * failed resource, an additional switch should be
   * made to revert to the preferred resource.
   * Revertive modes may require a wait to restore (WTR) time
   * setting.</p>
   **/
public final class ReversionMode_THolder implements org.omg.CORBA.portable.Streamable
{
  public protection.ReversionMode_T value = null;

  public ReversionMode_THolder ()
  {
  }

  public ReversionMode_THolder (protection.ReversionMode_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = protection.ReversionMode_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    protection.ReversionMode_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return protection.ReversionMode_THelper.type ();
  }

}