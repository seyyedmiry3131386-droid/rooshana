package androidx.profileinstaller;

import defpackage.am1;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.is3;
import defpackage.js3;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(am1[] am1VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (am1 am1Var : am1VarArr) {
            length += ((((am1Var.g * 2) + 7) & (-8)) / 8) + (am1Var.e * 2) + b(bArr, am1Var.a, am1Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + am1Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, is3.e)) {
            int length2 = am1VarArr.length;
            while (i < length2) {
                am1 am1Var2 = am1VarArr[i];
                k(byteArrayOutputStream, am1Var2, b(bArr, am1Var2.a, am1Var2.b));
                j(byteArrayOutputStream, am1Var2);
                i++;
            }
        } else {
            for (am1 am1Var3 : am1VarArr) {
                k(byteArrayOutputStream, am1Var3, b(bArr, am1Var3.a, am1Var3.b));
            }
            int length3 = am1VarArr.length;
            while (i < length3) {
                j(byteArrayOutputStream, am1VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(byte[] bArr, String str, String str2) {
        byte[] bArr2 = is3.f;
        byte[] bArr3 = is3.g;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return dw1.s(bl4.C(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iO = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iO += (int) js3.O(2, byteArrayInputStream);
            iArr[i2] = iO;
        }
        return iArr;
    }

    public static am1[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, am1[] am1VarArr) throws IOException {
        byte[] bArr3 = is3.h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, is3.i)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iO = (int) js3.O(2, fileInputStream);
            byte[] bArrN = js3.N(fileInputStream, (int) js3.O(4, fileInputStream), (int) js3.O(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrN);
            try {
                am1[] am1VarArrF = f(byteArrayInputStream, bArr2, iO, am1VarArr);
                byteArrayInputStream.close();
                return am1VarArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(is3.c, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iO2 = (int) js3.O(1, fileInputStream);
        byte[] bArrN2 = js3.N(fileInputStream, (int) js3.O(4, fileInputStream), (int) js3.O(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrN2);
        try {
            am1[] am1VarArrE = e(byteArrayInputStream2, iO2, am1VarArr);
            byteArrayInputStream2.close();
            return am1VarArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static am1[] e(ByteArrayInputStream byteArrayInputStream, int i, am1[] am1VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new am1[0];
        }
        if (i != am1VarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iO = (int) js3.O(2, byteArrayInputStream);
            iArr[i2] = (int) js3.O(2, byteArrayInputStream);
            strArr[i2] = new String(js3.L(iO, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            am1 am1Var = am1VarArr[i3];
            if (!am1Var.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            am1Var.e = i4;
            am1Var.h = c(byteArrayInputStream, i4);
        }
        return am1VarArr;
    }

    public static am1[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, am1[] am1VarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new am1[0];
        }
        if (i != am1VarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            js3.O(2, byteArrayInputStream);
            String str = new String(js3.L((int) js3.O(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jO = js3.O(4, byteArrayInputStream);
            int iO = (int) js3.O(2, byteArrayInputStream);
            am1 am1Var = null;
            if (am1VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= am1VarArr.length) {
                        break;
                    }
                    if (am1VarArr[i3].b.equals(strSubstring)) {
                        am1Var = am1VarArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (am1Var == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            am1Var.d = jO;
            int[] iArrC = c(byteArrayInputStream, iO);
            if (Arrays.equals(bArr, is3.g)) {
                am1Var.e = iO;
                am1Var.h = iArrC;
            }
        }
        return am1VarArr;
    }

    public static am1[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, is3.d)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iO = (int) js3.O(1, fileInputStream);
        byte[] bArrN = js3.N(fileInputStream, (int) js3.O(4, fileInputStream), (int) js3.O(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrN);
        try {
            am1[] am1VarArrH = h(byteArrayInputStream, str, iO);
            byteArrayInputStream.close();
            return am1VarArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static am1[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new am1[0];
        }
        am1[] am1VarArr = new am1[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iO = (int) js3.O(2, byteArrayInputStream);
            int iO2 = (int) js3.O(2, byteArrayInputStream);
            am1VarArr[i3] = new am1(str, new String(js3.L(iO, byteArrayInputStream), StandardCharsets.UTF_8), js3.O(4, byteArrayInputStream), iO2, (int) js3.O(4, byteArrayInputStream), (int) js3.O(4, byteArrayInputStream), new int[iO2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            am1 am1Var = am1VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = am1Var.f;
            int i6 = am1Var.g;
            TreeMap treeMap = am1Var.i;
            int i7 = iAvailable - i5;
            int iO3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iO3 += (int) js3.O(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iO3), 1);
                int iO4 = (int) js3.O(2, byteArrayInputStream);
                while (iO4 > 0) {
                    js3.O(2, byteArrayInputStream);
                    int iO5 = (int) js3.O(1, byteArrayInputStream);
                    if (iO5 != 6 && iO5 != 7) {
                        while (iO5 > 0) {
                            js3.O(1, byteArrayInputStream);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iO6 = (int) js3.O(1, byteArrayInputStream); iO6 > 0; iO6--) {
                                js3.O(2, byteArrayInputStream);
                            }
                            iO5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iO4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            am1Var.h = c(byteArrayInputStream, am1Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(js3.L((((i6 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return am1VarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, am1[] am1VarArr) throws IOException {
        int length;
        byte[] bArr2 = is3.g;
        byte[] bArr3 = is3.f;
        byte[] bArr4 = is3.c;
        int i = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = is3.d;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA = a(am1VarArr, bArr5);
                js3.Z(byteArrayOutputStream, am1VarArr.length, 1);
                js3.Z(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrU = js3.u(bArrA);
                js3.Z(byteArrayOutputStream, bArrU.length, 4);
                byteArrayOutputStream.write(bArrU);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                js3.Z(byteArrayOutputStream, am1VarArr.length, 1);
                for (am1 am1Var : am1VarArr) {
                    int size = am1Var.i.size() * 4;
                    String strB = b(bArr3, am1Var.a, am1Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    js3.a0(byteArrayOutputStream, strB.getBytes(charset).length);
                    js3.a0(byteArrayOutputStream, am1Var.h.length);
                    js3.Z(byteArrayOutputStream, size, 4);
                    js3.Z(byteArrayOutputStream, am1Var.c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator it = am1Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        js3.a0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        js3.a0(byteArrayOutputStream, 0);
                    }
                    for (int i2 : am1Var.h) {
                        js3.a0(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr6 = is3.e;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrA2 = a(am1VarArr, bArr6);
                js3.Z(byteArrayOutputStream, am1VarArr.length, 1);
                js3.Z(byteArrayOutputStream, bArrA2.length, 4);
                byte[] bArrU2 = js3.u(bArrA2);
                js3.Z(byteArrayOutputStream, bArrU2.length, 4);
                byteArrayOutputStream.write(bArrU2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            js3.a0(byteArrayOutputStream, am1VarArr.length);
            for (am1 am1Var2 : am1VarArr) {
                String str = am1Var2.a;
                TreeMap treeMap = am1Var2.i;
                String strB2 = b(bArr2, str, am1Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                js3.a0(byteArrayOutputStream, strB2.getBytes(charset2).length);
                js3.a0(byteArrayOutputStream, treeMap.size());
                js3.a0(byteArrayOutputStream, am1Var2.h.length);
                js3.Z(byteArrayOutputStream, am1Var2.c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    js3.a0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : am1Var2.h) {
                    js3.a0(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            js3.a0(byteArrayOutputStream2, am1VarArr.length);
            int i4 = 2;
            int i5 = 2;
            for (am1 am1Var3 : am1VarArr) {
                js3.Z(byteArrayOutputStream2, am1Var3.c, 4);
                js3.Z(byteArrayOutputStream2, am1Var3.d, 4);
                js3.Z(byteArrayOutputStream2, am1Var3.g, 4);
                String strB3 = b(bArr4, am1Var3.a, am1Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                js3.a0(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            b bVar = new b(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(bVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < am1VarArr.length; i7++) {
                try {
                    am1 am1Var4 = am1VarArr[i7];
                    js3.a0(byteArrayOutputStream3, i7);
                    js3.a0(byteArrayOutputStream3, am1Var4.e);
                    i6 = i6 + 4 + (am1Var4.e * i4);
                    int[] iArr = am1Var4.h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        js3.a0(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            b bVar2 = new b(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(bVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < am1VarArr.length) {
                try {
                    am1 am1Var5 = am1VarArr[i11];
                    Iterator it3 = am1Var5.i.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, iIntValue, am1Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, am1Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            js3.a0(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            js3.Z(byteArrayOutputStream3, length4, 4);
                            js3.a0(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            i = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            b bVar3 = new b(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(bVar3);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList.size() * 16));
            js3.Z(byteArrayOutputStream, arrayList.size(), 4);
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                b bVar4 = (b) arrayList.get(i14);
                FileSectionType fileSectionType = bVar4.a;
                byte[] bArr7 = bVar4.b;
                js3.Z(byteArrayOutputStream, fileSectionType.a, 4);
                js3.Z(byteArrayOutputStream, size2, 4);
                if (bVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrU3 = js3.u(bArr7);
                    arrayList2.add(bArrU3);
                    js3.Z(byteArrayOutputStream, bArrU3.length, 4);
                    js3.Z(byteArrayOutputStream, length5, 4);
                    length = bArrU3.length;
                } else {
                    arrayList2.add(bArr7);
                    js3.Z(byteArrayOutputStream, bArr7.length, 4);
                    js3.Z(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, am1 am1Var) throws IOException {
        m(byteArrayOutputStream, am1Var);
        int i = am1Var.g;
        int[] iArr = am1Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            js3.a0(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : am1Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, am1 am1Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        js3.a0(byteArrayOutputStream, str.getBytes(charset).length);
        js3.a0(byteArrayOutputStream, am1Var.e);
        js3.Z(byteArrayOutputStream, am1Var.f, 4);
        js3.Z(byteArrayOutputStream, am1Var.c, 4);
        js3.Z(byteArrayOutputStream, am1Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i, am1 am1Var) throws IOException {
        int i2 = am1Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : am1Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, am1 am1Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : am1Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                js3.a0(byteArrayOutputStream, iIntValue - i);
                js3.a0(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
