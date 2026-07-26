package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.io.FileWalkDirection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cc2 extends at2 {
    public static void o0(File file) {
        js3.p(file, "<this>");
        fq1 fq1Var = new fq1(new gq1(file, FileWalkDirection.b));
        while (true) {
            boolean z = true;
            while (fq1Var.hasNext()) {
                File file2 = (File) fq1Var.next();
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else if (z) {
                    break;
                } else {
                    z = false;
                }
            }
            return;
        }
    }

    public static File p0(File file, String str) {
        int length;
        int iK0;
        js3.p(str, "relative");
        File file2 = new File(str);
        String path = file2.getPath();
        js3.o(path, "getPath(...)");
        char c = File.separatorChar;
        int iK02 = f88.k0(c, 0, 4, path);
        if (iK02 != 0) {
            length = (iK02 <= 0 || path.charAt(iK02 + (-1)) != ':') ? (iK02 == -1 && f88.g0(path, ':')) ? path.length() : 0 : iK02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iK0 = f88.k0(c, 2, 4, path)) < 0) {
            length = 1;
        } else {
            int iK03 = f88.k0(c, iK0 + 1, 4, path);
            length = iK03 >= 0 ? iK03 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        js3.o(string, "toString(...)");
        if ((string.length() == 0) || f88.g0(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    public static final void q0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        js3.p(fileOutputStream, "<this>");
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            js3.o(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        js3.m(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        js3.o(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            js3.o(cArrArray, "array(...)");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
