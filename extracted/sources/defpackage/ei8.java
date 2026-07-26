package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.a;
import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes.dex */
public final class ei8 extends rh3 {
    public final String b;
    public final ImmutableList c;

    /* JADX WARN: Multi-variable type inference failed */
    public ei8(String str, String str2, List list) {
        super(str);
        vy2.j(!((AbstractCollection) list).isEmpty());
        this.b = str2;
        ImmutableList immutableListN = ImmutableList.n(list);
        this.c = immutableListN;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rh3, defpackage.iv4
    public final void b(pp4 pp4Var) {
        byte b;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                b = !str.equals("TAL") ? (byte) -1 : (byte) 0;
                break;
            case 82878:
                b = !str.equals("TCM") ? (byte) -1 : (byte) 1;
                break;
            case 82897:
                b = !str.equals("TDA") ? (byte) -1 : (byte) 2;
                break;
            case 83253:
                b = !str.equals("TP1") ? (byte) -1 : (byte) 3;
                break;
            case 83254:
                b = !str.equals("TP2") ? (byte) -1 : (byte) 4;
                break;
            case 83255:
                b = !str.equals("TP3") ? (byte) -1 : (byte) 5;
                break;
            case 83341:
                b = !str.equals("TRK") ? (byte) -1 : (byte) 6;
                break;
            case 83378:
                b = !str.equals("TT2") ? (byte) -1 : (byte) 7;
                break;
            case 83536:
                b = !str.equals("TXT") ? (byte) -1 : (byte) 8;
                break;
            case 83552:
                b = !str.equals("TYE") ? (byte) -1 : (byte) 9;
                break;
            case 2567331:
                b = !str.equals("TALB") ? (byte) -1 : (byte) 10;
                break;
            case 2569357:
                b = !str.equals("TCOM") ? (byte) -1 : (byte) 11;
                break;
            case 2569358:
                b = !str.equals("TCON") ? (byte) -1 : (byte) 12;
                break;
            case 2569891:
                b = !str.equals("TDAT") ? (byte) -1 : (byte) 13;
                break;
            case 2570401:
                b = !str.equals("TDRC") ? (byte) -1 : Dot11LinkAdaptationControl.ASELI;
                break;
            case 2570410:
                b = !str.equals("TDRL") ? (byte) -1 : (byte) 15;
                break;
            case 2571565:
                b = !str.equals("TEXT") ? (byte) -1 : (byte) 16;
                break;
            case 2575251:
                b = !str.equals("TIT2") ? (byte) -1 : (byte) 17;
                break;
            case 2581512:
                b = !str.equals("TPE1") ? (byte) -1 : (byte) 18;
                break;
            case 2581513:
                b = !str.equals("TPE2") ? (byte) -1 : (byte) 19;
                break;
            case 2581514:
                b = !str.equals("TPE3") ? (byte) -1 : (byte) 20;
                break;
            case 2583398:
                b = !str.equals("TRCK") ? (byte) -1 : (byte) 21;
                break;
            case 2590194:
                b = !str.equals("TYER") ? (byte) -1 : (byte) 22;
                break;
            default:
                b = -1;
                break;
        }
        ImmutableList immutableList = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    pp4Var.c = (CharSequence) immutableList.get(0);
                    break;
                case 1:
                case 11:
                    pp4Var.z = (CharSequence) immutableList.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) immutableList.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    pp4Var.t = Integer.valueOf(i);
                    pp4Var.u = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    pp4Var.b = (CharSequence) immutableList.get(0);
                    break;
                case 4:
                case 19:
                    pp4Var.d = (CharSequence) immutableList.get(0);
                    break;
                case 5:
                case 20:
                    pp4Var.A = (CharSequence) immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) immutableList.get(0);
                    String str4 = j29.a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    pp4Var.n = Integer.valueOf(i3);
                    pp4Var.o = numValueOf;
                    break;
                case 7:
                case 17:
                    pp4Var.a = (CharSequence) immutableList.get(0);
                    break;
                case 8:
                case 16:
                    pp4Var.y = (CharSequence) immutableList.get(0);
                    break;
                case 9:
                case 22:
                    pp4Var.s = Integer.valueOf(Integer.parseInt((String) immutableList.get(0)));
                    break;
                case 12:
                    Integer numH = a.h((String) immutableList.get(0));
                    if (numH != null) {
                        String strA = th3.a(numH.intValue());
                        if (strA != null) {
                            pp4Var.D = strA;
                        }
                    } else {
                        pp4Var.D = (CharSequence) immutableList.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) immutableList.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                pp4Var.u = (Integer) arrayListD.get(2);
                            }
                        }
                        pp4Var.t = (Integer) arrayListD.get(1);
                    }
                    pp4Var.s = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) immutableList.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                pp4Var.x = (Integer) arrayListD2.get(2);
                            }
                        }
                        pp4Var.w = (Integer) arrayListD2.get(1);
                    }
                    pp4Var.v = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ei8.class == obj.getClass()) {
            ei8 ei8Var = (ei8) obj;
            if (Objects.equals(this.a, ei8Var.a) && Objects.equals(this.b, ei8Var.b) && this.c.equals(ei8Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iK = rm7.k(this.a, 527, 31);
        String str = this.b;
        return this.c.hashCode() + ((iK + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.rh3
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
