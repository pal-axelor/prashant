import com.google.inject.ImplementedBy;

@ImplementedBy(ServiceImpl.class)
public interface Service {
public String myString(String string,int age);
}
