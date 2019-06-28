import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.AbstractModule;
import com.google.inject.BindingAnnotation;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

@BindingAnnotation @Target({FIELD,PARAMETER,METHOD}) @Retention(RUNTIME)
@interface WinWord {}
public class App {
   public static void main(String[] args) {
      Injector injector = Guice.createInjector(new TextEditorModule());
      TextEditor editor = injector.getInstance(TextEditor.class);
      editor.makeSpellCheck(); 
      
      
      SpellCheckerImpl scl = new SpellCheckerImpl();
      scl.myFunction("praj",4);
      scl.checkSpelling();
      
   } 
}
class TextEditor {
	 private SpellChecker spellchecker;
	 @Inject
	 
	 public TextEditor( SpellChecker spellChecker) {
		 this.spellchecker = spellChecker;
	 }
	 
	 
	 
	 
	
//	   public TextEditor(@Named("prashant") SpellChecker spellChecker) {
//	     this.spellchecker = spellChecker;
//	  }
	
	
/*	Provider<SpellChecker> spellchecker;
	@Inject
	   public TextEditor(Provider<SpellChecker> spellChecker) {
	     this.spellchecker = spellChecker;
	  }*/
	
	
	
	//this is for implicit provider
/*	 Provider<SpellChecker> spellchecker;
	@Inject
	   public TextEditor(Provider<SpellChecker> spellChecker) {
	     this.spellchecker = spellChecker;
	  }*/
	
	
  // private SpellChecker spellChecker;

 /*String string;  // this is for named constant
   @Inject
   public TextEditor(@Named("prashant") String string) {
	   this.string=string;
   }*/
   
   
   /*  @Inject  // this is for named annotation
   public TextEditor(@Named("prashant") SpellChecker spellChecker) {
     this.spellChecker = spellChecker;
  }*/
   
   
 // @Inject   // this is for binding annotaion  
//   public TextEditor(@WinWord SpellChecker spellChecker) {
//      this.spellChecker = spellChecker;
//   }
   
   
   
   public void makeSpellCheck() {
	   spellchecker.checkSpelling();
	  // spellchecker.get().checkGrammer(); 
	  //spellchecker.get().checkGrammer();   tthis is for implicit provider
	   
      //spellChecker.checkGrammer();
	   
	 //System.out.println("hello"+string); this is for Named Constant 
   }
}

//Binding Module
class TextEditorModule extends AbstractModule {
   @Override
   
   protected void configure() {
	   
	 bind(String.class).annotatedWith(Names.named("prashant")).toInstance("my name is prashant");
	 bind(Integer.class).annotatedWith(Names.named("prashant1")).toInstance(5);
	 bind(SpellChecker.class).to(SpellCheckerImpl.class);
	   
//	      try {
//	         bind(SpellChecker.class)
//	            .toConstructor(SpellCheckerImpl.class.getConstructor(String.class));
//	      } catch (NoSuchMethodException | SecurityException e) {
//	         System.out.println("Required constructor missing");
//	      } 
//	      bind(String.class)
//	         .annotatedWith(Names.named("prashant"))
//	         .toInstance("jdbc:mysql://localhost:5326/emp");  
	  // bind(SpellChecker.class).toProvider(Method_provider.class); // this is for our provider
	 //  bind(SpellChecker.class).to(SpellChecker2Impl.class);// this was for implicit provider
	   //bind(SpellChecker.class).toProvider((Class<? extends javax.inject.Provider<? extends SpellChecker>>) SpellChecker.class);
	   //bind(String.class).annotatedWith(Names.named("prashant")).toInstance(" i m prashant, good mornig!!!!");  this is for named constant
	     //bind(SpellChecker.class).annotatedWith(Names.named("prashant")).to(SpellChecker2Impl.class); // this is for named annotation
	  // bind(SpellChecker.class).annotatedWith(WinWord.class).to(SpellChecker2Impl.class);  // this is for binding annotation
      //bind(SpellChecker.class).to(SpellCheckerImpl.class);  // this is for linked binding
     // bind(SpellCheckerImpl.class).to(SpellChecker2Impl.class); // this is also for linked binding
   }
}

   /*
   @Provides
	public SpellChecker get(){
	   Scanner sc=new Scanner(System.in);
		//System.out.println("enter your int id:");
		int c=sc.nextInt();
	 if(c==5) {
		 return new SpellCheckerImpl();
	 }
	return new SpellChecker2Impl();
}*/

//spell checker interface
// @ImplementedBy(SpellCheckerImpl.class)
interface SpellChecker {
   public void checkSpelling();
   public void checkGrammer();
}


//this is for our provider
/*class Method_provider implements Provider<SpellChecker>{
	
	Scanner sc=new Scanner(System.in);
	//System.out.println("enter your int id:");
	int c=sc.nextInt();
	public SpellChecker get(){
	
	 if(c==5) {
		 return new SpellCheckerImpl();
	 }
	return new SpellChecker2Impl();
	
}
}*/

//spell checker implementation
class SpellCheckerImpl implements SpellChecker {
	 public SpellCheckerImpl(){}
	String url;
	SpellCheckerImpl(@Named("prashant")String url){
		
		this.url=url;
	}
//	@Inject
//	@Named("prashant")
	String string;
	int c;
	
	@Inject
	public void myFunction(@Named("prashant")String string,@Named("prashant1")int c) {
		this.string=string;
		this.c=c;
		System.out.println("String is:"+this.string+"my age is"+this.c+" myFunctiion");
	}
	@Override
   
   public void checkSpelling() {
      System.out.println("Inside checkSpelling." );
      System.out.println("String is:"+this.string+"my age is"+this.c);
   } 
   public void checkGrammer() {
	      System.out.println("Inside checkGrammer." );
	      System.out.println("url is  :"+url);
	   } 
   public void check() {
	      System.out.println("Inside check." );
	   } 
}


class SpellChecker2Impl extends SpellCheckerImpl {
	   @Override
	   
	   public void checkSpelling() {
	      System.out.println("Inside checkSpelling2." );
	   } 
	   public void checkGrammer() {
		      System.out.println("Inside checkGrammer2." );
		   } 
}
