/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{

    static String filename = "caterpillar.jpg";
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture water = new Picture(filename);
    water.explore();
    water.zeroBlue();
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture(filename);
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
      Picture caterpillar = new Picture(filename);
      caterpillar.explore();
      caterpillar.mirrorVerticalRightToLeft();
      caterpillar.explore();
    }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture(filename);
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepOnlyBlue(){

      Picture pic = new Picture(filename);
      pic.KeepOnlyBlue();
      pic.explore();
  }

  public static void testNegate(){
      Picture pic1 = new Picture(filename);
      pic1.negate();
      pic1.explore();
  }

  public static void testGrayscale(){
      Picture pic1 = new Picture(filename);
      pic1.grayscale();
      pic1.explore();
  }

  public static void testfixUnderWater(){
      Picture pic1 = new Picture(filename);
      pic1.fixUnderWater();
      pic1.explore();
  }

  public static void testmirrorHorizontal(){
      Picture caterpillar = new Picture(filename);
      caterpillar.explore();
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
      // testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testMirrorVerticalRightToLeft();
      testmirrorHorizontal();
  }
}