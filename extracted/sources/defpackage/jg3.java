package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.commons.io.output.StringBuilderWriter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jg3 {
    public static final /* synthetic */ int a = 0;

    static {
        char c = File.separatorChar;
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        printWriter.println();
        stringBuilderWriter.toString();
        printWriter.close();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
