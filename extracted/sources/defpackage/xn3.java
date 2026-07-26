package defpackage;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class xn3 {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");
    public static final Pattern n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");
    public final BitSet a;
    public final BitSet b;
    public final HashMap c;
    public final nc2 d;
    public String e;
    public int f;
    public mj1 g;
    public qg0 h;

    public xn3(nc2 nc2Var) {
        List list = (List) nc2Var.c;
        HashMap map = new HashMap();
        b(Arrays.asList(new tw('*'), new tw('_')), map);
        b(list, map);
        this.c = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.a = bitSet2;
        this.d = nc2Var;
    }

    public static void a(char c, nj1 nj1Var, HashMap map) {
        if (((nj1) map.put(Character.valueOf(c), nj1Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void b(Iterable iterable, HashMap map) {
        e48 e48Var;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nj1 nj1Var = (nj1) it.next();
            char cE = nj1Var.e();
            char cB = nj1Var.b();
            if (cE == cB) {
                nj1 nj1Var2 = (nj1) map.get(Character.valueOf(cE));
                if (nj1Var2 == null || nj1Var2.e() != nj1Var2.b()) {
                    a(cE, nj1Var, map);
                } else {
                    if (nj1Var2 instanceof e48) {
                        e48Var = (e48) nj1Var2;
                    } else {
                        e48 e48Var2 = new e48(cE);
                        e48Var2.f(nj1Var2);
                        e48Var = e48Var2;
                    }
                    e48Var.f(nj1Var);
                    map.put(Character.valueOf(cE), e48Var);
                }
            } else {
                a(cE, nj1Var, map);
                a(cB, nj1Var, map);
            }
        }
    }

    public static void d(nf8 nf8Var, nf8 nf8Var2, int i2) {
        if (nf8Var == null || nf8Var2 == null || nf8Var == nf8Var2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(nf8Var.f);
        co5 co5Var = nf8Var.e;
        co5 co5Var2 = nf8Var2.e;
        while (co5Var != co5Var2) {
            sb.append(((nf8) co5Var).f);
            co5 co5Var3 = co5Var.e;
            co5Var.f();
            co5Var = co5Var3;
        }
        nf8Var.f = sb.toString();
    }

    public static void e(co5 co5Var, co5 co5Var2) {
        nf8 nf8Var = null;
        nf8 nf8Var2 = null;
        int length = 0;
        while (co5Var != null) {
            if (co5Var instanceof nf8) {
                nf8Var2 = (nf8) co5Var;
                if (nf8Var == null) {
                    nf8Var = nf8Var2;
                }
                length = nf8Var2.f.length() + length;
            } else {
                d(nf8Var, nf8Var2, length);
                nf8Var = null;
                nf8Var2 = null;
                length = 0;
            }
            if (co5Var == co5Var2) {
                break;
            } else {
                co5Var = co5Var.e;
            }
        }
        d(nf8Var, nf8Var2, length);
    }

    public final String c(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fa A[PHI: r2
      0x01fa: PHI (r2v78 char) = (r2v77 char), (r2v82 char), (r2v83 char) binds: [B:113:0x01ed, B:115:0x01f1, B:118:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x053c A[LOOP:0: B:3:0x0013->B:265:0x053c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0543 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [co5] */
    /* JADX WARN: Type inference failed for: r3v15, types: [nf8] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18, types: [co5, hd3] */
    /* JADX WARN: Type inference failed for: r3v22, types: [nf8] */
    /* JADX WARN: Type inference failed for: r3v41, types: [co5] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v56, types: [co5] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r5v26, types: [wn3] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r26, defpackage.co5 r27) {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn3.f(java.lang.String, co5):void");
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(mj1 mj1Var) {
        boolean z;
        co5 co5Var;
        HashMap map = new HashMap();
        mj1 mj1Var2 = this.g;
        while (mj1Var2 != null) {
            mj1 mj1Var3 = mj1Var2.e;
            if (mj1Var3 == mj1Var) {
                break;
            } else {
                mj1Var2 = mj1Var3;
            }
        }
        while (mj1Var2 != null) {
            nf8 nf8Var = mj1Var2.a;
            char c = mj1Var2.b;
            nj1 nj1Var = (nj1) this.c.get(Character.valueOf(c));
            if (!mj1Var2.d || nj1Var == null) {
                mj1Var2 = mj1Var2.f;
            } else {
                char cE = nj1Var.e();
                mj1 mj1Var4 = mj1Var2.e;
                int iD = 0;
                boolean z2 = false;
                while (mj1Var4 != null && mj1Var4 != mj1Var && mj1Var4 != map.get(Character.valueOf(c))) {
                    if (mj1Var4.c && mj1Var4.b == cE) {
                        iD = nj1Var.d(mj1Var4, mj1Var2);
                        z2 = true;
                        if (iD > 0) {
                            z = true;
                            break;
                        }
                    }
                    mj1Var4 = mj1Var4.e;
                }
                z = z2;
                z2 = false;
                if (z2) {
                    nf8 nf8Var2 = mj1Var4.a;
                    mj1Var4.g -= iD;
                    mj1Var2.g -= iD;
                    nf8Var2.f = dw1.l(nf8Var2.f, iD, 0);
                    nf8Var.f = dw1.l(nf8Var.f, iD, 0);
                    mj1 mj1Var5 = mj1Var2.e;
                    while (mj1Var5 != null && mj1Var5 != mj1Var4) {
                        mj1 mj1Var6 = mj1Var5.e;
                        i(mj1Var5);
                        mj1Var5 = mj1Var6;
                    }
                    if (nf8Var2 != nf8Var && (co5Var = nf8Var2.e) != nf8Var) {
                        e(co5Var, nf8Var.d);
                    }
                    nj1Var.a(nf8Var2, nf8Var, iD);
                    if (mj1Var4.g == 0) {
                        mj1Var4.a.f();
                        i(mj1Var4);
                    }
                    if (mj1Var2.g == 0) {
                        mj1 mj1Var7 = mj1Var2.f;
                        nf8Var.f();
                        i(mj1Var2);
                        mj1Var2 = mj1Var7;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), mj1Var2.e);
                        if (!mj1Var2.c) {
                            i(mj1Var2);
                        }
                    }
                    mj1Var2 = mj1Var2.f;
                }
            }
        }
        while (true) {
            mj1 mj1Var8 = this.g;
            if (mj1Var8 == null || mj1Var8 == mj1Var) {
                return;
            } else {
                i(mj1Var8);
            }
        }
    }

    public final void i(mj1 mj1Var) {
        mj1 mj1Var2 = mj1Var.e;
        if (mj1Var2 != null) {
            mj1Var2.f = mj1Var.f;
        }
        mj1 mj1Var3 = mj1Var.f;
        if (mj1Var3 == null) {
            this.g = mj1Var2;
        } else {
            mj1Var3.e = mj1Var2;
        }
    }
}
