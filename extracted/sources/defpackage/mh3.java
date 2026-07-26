package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class mh3 extends lb7 {
    public static final Pattern e = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder c = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder d = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.lb7
    public final jv4 c(mv4 mv4Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.d;
        CharsetDecoder charsetDecoder2 = this.c;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new jv4(new oh3(bArr, null, null));
        }
        Matcher matcher = e.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strL = wu8.L(strGroup);
                strL.getClass();
                if (strL.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strL.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new jv4(new oh3(bArr, str, str2));
    }
}
