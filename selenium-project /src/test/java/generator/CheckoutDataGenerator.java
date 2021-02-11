package generator;

import model.CheckoutData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class CheckoutDataGenerator {  // TODO: fix out of bound Exception
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(args[0]);
        File file = new File(args[1]);

        List<CheckoutData> data = generateCheckoutData(count);
        save(data, file);
    }

    private static void save(List<CheckoutData> fields, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (CheckoutData data : fields) {
            writer.write(String.format("%s; %s; %s \n",
                    data.getFirstName(), data.getLastName(), data.getZipCode()));
        }
        writer.close(); // close writer
    }

    private static List<CheckoutData> generateCheckoutData(int count) {
        List<CheckoutData> data = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            data.add(new CheckoutData()
                    .setFirstName(String.format("testName %s", i))
                    .setLastName(String.format("testLastName %s", i))
                    .setZipCode(String.format("123456789 %s", i)));
        }

        return data;
    }
}
