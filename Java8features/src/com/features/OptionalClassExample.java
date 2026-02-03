package com.features;

import java.util.Optional;

public class OptionalClassExample {
	public static void main(String[] args) {
	 String[] str= {"deva","datta",null,"devendranath",null};
     
	for(String s:str) {
		
		Optional<String> o=Optional.ofNullable(s);
		//o.ifPresentOrElse(x->System.out.println(s.toUpperCase()), ()->{System.out.println("not found");});
	o.ifPresent(x->System.out.println(s.toUpperCase()));
	}
	 
	 
	}
}
//package com.features;

// import java.util.Optional;

// class User{
// 	//for printing names without null iterating 
// 	public static void Name(String[] s) {
// 		for(String s1:s) {
// 		    if(s1!=null) {
// 			  System.out.print(s1+" ");
// 		    }
// 		}
// 	}
// 	//Optional:used to get the obj  which can hold null or any obj
// 	//for optional we use method which returns anything null or obj that can store anything
	
// 	public static Optional<String> getName(String[] s,int index) {
// 		return Optional.ofNullable(s[index]);
// 	}
// }


// public class OptionalReturnExample {
//     public static void main(String[] args) {
//     	String[] s= {"deva","datta",null,"wewe"};
//           Optional<String> s1=User.getName(s, 2);
//           s1.ifPresentOrElse(
//         		  (value)->System.out.println(value),
//         		  ()->System.out.println("user not found")
//           );     
//     }
// }

