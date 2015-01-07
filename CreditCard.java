
public class CreditCard
{
String CreditCard;
//take the given card number
// ".toString" converts an integer to a string
//find the length of the string ?
 

public boolean verify (String num)
{
  int totalsum = 0;
  int i = (num.length() - 1);//the index of the last digit of the card number
  while (i > 0)
  {
  int placeholder = Integer.parseInt(num.substring(i, i + 1));//placeholder = the digit of the last digit of the code
  placeholder = placeholder * 2;
  if (placeholder - 9 > 0) //if it's greater than 9
         {
          int digit2 = 0;
          digit2 = placeholder - 10;
          //the other digit will be 1 
          placeholder = digit2 + 1;
          totalsum += Integer.parseInt(num.substring(i, i + 1));
          totalsum += Integer.parseInt(num.substring(i - 1, i));
          i -= 2;
         }
  else
  {
    totalsum += Integer.parseInt(num.substring(i, i + 1));
    totalsum += Integer.parseInt(num.substring(i - 1, i));
    i -= 2;
  }
if (totalsum % 10 == 0)
  {
    System.out.print("THE NUMBER IS VALID, HUZZAH!"); //I ended up not needing this, just the return statement
    
  } 
}
return true;
}

public int findType (String num)
 {
 /* int cardtype = 0;
  int visa = 1;
  int mastercard = 2;
  int discover = 3;
  int amex = 4;
  int carteblanche = 5; 
  */
//"none", "Master Card", "Visa", "American Express", "Discover", "Diners Club/ Carte
if (num.substring(0 , 1).equals("4"))
    return 2;

else if (num.substring(0,2).equals("51") || 
         num.substring(0,2).equals("52") || 
         num.substring(0,2).equals("53") || 
         num.substring(0,2).equals("54") || 
         num.substring(0,2).equals("55"))
  return 1;

else if (num.substring(0,4).equals("6011"))
  return 4;

else if (num.substring(0,2).equals("34") ||
         num.substring(0,2).equals("37"))
  return 3;
 
else if (num.substring(0,2).equals("36") || 
         num.substring(0,2).equals("38") ||
         num.substring(0,3).equals("300") || 
         num.substring(0,3).equals("301") || 
         num.substring(0,3).equals("302") || 
         num.substring(0,3).equals("303") || 
         num.substring(0,3).equals("304") || 
         num.substring(0,3).equals("305"))
  return 5;
  
else return 0; //all invalids will be this
  
 }
}
//Sorry this is ridiculously late, Mr. Kiang!  It's been 95% done for weeks, and I just could NOT figure out what the heck 
//was wrong with it.  I finally realized that I had been using "==" rather than ".equals", and that was basically the whole problem!

//////this is all extra stuff I ended up not needing
/*//GETS SUM OF ODD NUMBERS
    int i = (num.length() - 2);
    //int i = 15
    int oddsum = 0;
    int csl = 0; 

  while (i > 0)  //don't know if I'm using "while" right
    {
     csl += ; //(the number in the place)
     csl = csl * csl;
         //do the 2 digit add-y thing
         if (csl - 9 > 0)
         {
          int digit2 = 0;
          csl - 10 = digit2;
          //the other digit will be 1 
          digit2 + 1 = csl;
         }
    oddsum += csl;
     i -= 2;
    }
}

//GETS SUM OF EVEN NUMBERS
{
  int i = (num.length) //- 2);
  int evensum = 0;
  int csl = 0;

 while(i >= 0)
    {
     c[i] = csl;// (the number in the place)
     csl = csl * csl;
     //do the 2 digit add-y thing
     evensum += csl;
     i -= 2;
    }
}

*/
  
//}
//}

/*
FIND OUT THE CARD TYPE YOOOO
int cardtype = 0
    Visa = 1
    Mastercard = 2
    Discover = 3
    Amex = 4
    CarteBlanche = 5
    
if (c[0] == "4")
  cardtype = 1;

if (c[0, 2] == "51" || "52" || "53" || "54" || "55")
  cardtype = 2;

if (c[0, 4] == "6011")
  cardtype = 3;

if (c[0,2] == "34" || "37")
  cardtype = 4;
 
if ([c[0] == "8" || c[0,2] == "36" || c[0,3] == "300" || "301" || "302" || "303" || "304" || "305")
  cardtype = 5;
  
else (cardtype = 6); //all invalids will be this
  
///////////
if (cardtype == 1)
  System.out.println("This card is a Visa!");
else if (cardtype == 2)
  System.out.println("This card is a Mastercard!");
else if (cardtype == 3)
  System.out.println("This card is a Discover!");
else if (cardtype == 4)
  System.out.println("This card is an American Express!");
else if (cardtype == 5)
  System.out.println("This card is a Carte Blanche/Diner's!");
else if (cardtype == 6)
  System.out.println("This card is INVALID!");

*/
