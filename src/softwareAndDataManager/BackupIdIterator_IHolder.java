package softwareAndDataManager;

/**
* softwareAndDataManager/BackupIdIterator_IHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from softwareAndDataManager.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   *
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   *
   * <p> This iterator is used to retrieve all ME configuration data backup 
   * Ids.</p>
   **/
public final class BackupIdIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public softwareAndDataManager.BackupIdIterator_I value = null;

  public BackupIdIterator_IHolder ()
  {
  }

  public BackupIdIterator_IHolder (softwareAndDataManager.BackupIdIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = softwareAndDataManager.BackupIdIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    softwareAndDataManager.BackupIdIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return softwareAndDataManager.BackupIdIterator_IHelper.type ();
  }

}