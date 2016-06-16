package CosTrading.ProxyPackage;


/**
* CosTrading/ProxyPackage/IllegalRecipe.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class IllegalRecipe extends org.omg.CORBA.UserException
{
  public String recipe = null;

  public IllegalRecipe ()
  {
    super(IllegalRecipeHelper.id());
  } // ctor

  public IllegalRecipe (String _recipe)
  {
    super(IllegalRecipeHelper.id());
    recipe = _recipe;
  } // ctor


  public IllegalRecipe (String $reason, String _recipe)
  {
    super(IllegalRecipeHelper.id() + "  " + $reason);
    recipe = _recipe;
  } // ctor

} // class IllegalRecipe