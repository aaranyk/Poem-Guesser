import java.util.Scanner;

class ComputingPoetry{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String word; 
    String doubleVowels;
    int wordLength;
    int numOfSyllables;
    int numOfVowels; 
    String vowels; 
    int vowelsLength;
    String vowelsWithoutY;
    int vowelsWithoutYLen;
    
    numOfSyllables = 0;
    numOfVowels = 0;
    vowels = "AEIOUYaeiouy";
    vowelsWithoutY = "AEIOUaeiou";
    
    vowelsLength = vowels.length(); 
    vowelsWithoutYLen = vowelsWithoutY.length();
    
    System.out.print("Enter the word");
    
    word = input.nextLine(); 
    wordLength = word.length();

    for(int count = 0; count<wordLength; count++){      
      for(int vowelsPosition = 0; vowelsPosition<vowelsLength; vowelsPosition++){
        if(word.charAt(count) == vowels.charAt(vowelsPosition)){
              if(word.charAt(count) == vowels.charAt(vowelsPosition)){
                numOfVowels = numOfVowels + 1; 
              }
           }
        }
      }
    
    //*REMOVE SAME DUPLICATE - block 2
     for(int count = 0; count<wordLength; count++){      
      for(int vowelsPosition = 0; vowelsPosition<vowelsLength; vowelsPosition++){
        if(word.charAt(count) == vowels.charAt(vowelsPosition)){
            if(count+1<wordLength){
              if(word.charAt(count+1) == vowels.charAt(vowelsPosition)){
                numOfVowels = numOfVowels - 1; 
              }
           }
        }
      }
     }
    //*
     //*REMOVE DIFFERENT TWO VOWELS ex.ae, ai, ea, ou - block 3
        
        for(int firstVowel = 0; firstVowel<vowelsWithoutYLen; firstVowel++){
           String firstVowels = vowelsWithoutY.substring(firstVowel,firstVowel+1);
          // System.out.println(firstVowels);
           
           for(int secondVowel = 0; secondVowel<vowelsWithoutYLen; secondVowel++){
              String firstAndSecondVowel = firstVowels + vowelsWithoutY.substring(secondVowel,secondVowel+1);
             // System.out.println(firstAndSecondVowel);
              
             if(firstVowel != secondVowel){
                //System.out.println(firstAndSecondVowel);
               if(word.indexOf(firstAndSecondVowel) != -1){
                 numOfSyllables = numOfSyllables - 1;
              }
               }
             
           }
        }
        
     //*end of block 3
        
    //remove anything with y block 4
        
        for(int firstVowel = 0; firstVowel<vowelsWithoutYLen; firstVowel++){
           String firstVowels = vowelsWithoutY.substring(firstVowel,firstVowel+1);
          // System.out.println(firstVowels);
           String vowelAndY = firstVowels + "y";
          //System.out.println(firstAndSecondVowel);
          if(word.indexOf(vowelAndY) != -1){
            numOfSyllables = numOfSyllables - 1;
          }
        }
        
     //*end of block 4
     //Logic done above
    numOfSyllables = numOfSyllables + numOfVowels; 

    if(word.substring(wordLength-3).equals("ded")){
     
    }else if(word.substring(wordLength-3).equals("ted")){
      
    }else if(word.substring(wordLength-2).equals("ed")){
        numOfSyllables = numOfSyllables - 1;
    }
  
    if(word.substring(wordLength-4).equals("zled")){
      numOfSyllables = numOfSyllables + 1;
    }
    if(word.substring(wordLength-4).equals("tled")){
      numOfSyllables = numOfSyllables + 1;
    }
    if(word.charAt(0) == 'Y' || word.charAt(0) == 'y'){
      numOfSyllables = numOfSyllables - 1;
    }
 

    if(word.charAt(wordLength-1) == 'e'){
      numOfSyllables = numOfSyllables -1;
    }
    
    if(word.substring(wordLength-4).equals("eves")){
      numOfSyllables = numOfSyllables -1;
    }
    
    if(word.substring(wordLength-4).equals("opia")){
      numOfSyllables = numOfSyllables + 1;
    }
    if(word.substring(wordLength-5).equals("opian")){
      numOfSyllables = numOfSyllables + 1;
    }  
    String consonant = "bdfghjklmnpqrstvwxz";
    int consonantLength = consonant.length();
    for(int consonantCounter = 0; consonantCounter<consonantLength; consonantCounter++){
      if(word.substring(wordLength-2).equals("le") && word.charAt(wordLength-3) == consonant.charAt(consonantCounter)){
        numOfSyllables = numOfSyllables + 1;
    }
  }  
    
    if((numOfVowels == 0) || (numOfSyllables == 0)){
      numOfSyllables = 1;
    }
    System.out.println(numOfSyllables); 
  }
}






    
