package performance;


/**
* performance/AdministrativeState_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/


/**
   * <p>AdministrativeState_T indicates whether a specified function is enabled 
   * (unlocked) or disabled (locked). </p>
   **/
public class AdministrativeState_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static performance.AdministrativeState_T[] __array = new performance.AdministrativeState_T [__size];

  public static final int _AS_Locked = 0;
  public static final performance.AdministrativeState_T AS_Locked = new performance.AdministrativeState_T(_AS_Locked);
  public static final int _AS_Unlocked = 1;
  public static final performance.AdministrativeState_T AS_Unlocked = new performance.AdministrativeState_T(_AS_Unlocked);

  public int value ()
  {
    return __value;
  }

  public static performance.AdministrativeState_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AdministrativeState_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AdministrativeState_T
