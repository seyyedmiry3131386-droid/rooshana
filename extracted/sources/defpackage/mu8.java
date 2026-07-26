package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class mu8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        boolean zD;
        BitSet bitSet = new BitSet();
        mw3Var.c1();
        JsonToken jsonTokenR = mw3Var.R();
        int i = 0;
        while (jsonTokenR != JsonToken.b) {
            int iOrdinal = jsonTokenR.ordinal();
            if (iOrdinal == 5 || iOrdinal == 6) {
                int iNextInt = mw3Var.nextInt();
                if (iNextInt == 0) {
                    zD = false;
                } else {
                    if (iNextInt != 1) {
                        StringBuilder sbR = rm7.r(iNextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbR.append(mw3Var.k(true));
                        throw new JsonSyntaxException(sbR.toString());
                    }
                    zD = true;
                }
            } else {
                if (iOrdinal != 7) {
                    throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenR + "; at path " + mw3Var.k(false));
                }
                zD = mw3Var.D();
            }
            if (zD) {
                bitSet.set(i);
            }
            i++;
            jsonTokenR = mw3Var.R();
        }
        mw3Var.W0();
        return bitSet;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        uw3Var.c1();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            uw3Var.P(bitSet.get(i) ? 1L : 0L);
        }
        uw3Var.W0();
    }
}
