package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Student student=new Student ("Jan", "Kowalski", 32 );
        Student student1=new Student ("Zbychu", "Zieliński", 22 );
        Student student2=new Student ("Iwo", "Wisniewski", 31 );
        Student student3=new Student ("Krzyś", "Nowak", 34 );
        Student student4=new Student ("Adam", "Kowal", 30 );
        Student student5=new Student ("Piotr", "Gmoch", 33 );
	// serializacji- przekształcenie obiektu na formę tekstową
        // biblioteka Jackson faster xml
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            objectMapper.writeValue(new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student1);
            objectMapper.writeValue(new File("student2.json"), student2);
            objectMapper.writeValue(new File("student3.json"), student3);
            objectMapper.writeValue(new File("student4.json"), student4);
            objectMapper.writeValue(new File("student5.json"), student5);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
