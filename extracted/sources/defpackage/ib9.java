package defpackage;

import androidx.media3.common.b;
import com.google.common.primitives.a;
import com.j256.ormlite.stmt.query.SimpleComparison;

/* JADX INFO: loaded from: classes.dex */
public final class ib9 implements iv4 {
    public final String a;
    public final String b;

    public ib9(String str, String str2) {
        this.a = wu8.M(str);
        this.b = str2;
    }

    @Override // defpackage.iv4
    public final /* synthetic */ b a() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.iv4
    public final void b(pp4 pp4Var) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numH = a.h(str2);
                if (numH != null) {
                    pp4Var.o = numH;
                }
                break;
            case 1:
                Integer numH2 = a.h(str2);
                if (numH2 != null) {
                    pp4Var.C = numH2;
                }
                break;
            case 2:
                Integer numH3 = a.h(str2);
                if (numH3 != null) {
                    pp4Var.n = numH3;
                }
                break;
            case 3:
                pp4Var.c = str2;
                break;
            case 4:
                pp4Var.D = str2;
                break;
            case 5:
                pp4Var.a = str2;
                break;
            case 6:
                pp4Var.g = str2;
                break;
            case 7:
                Integer numH4 = a.h(str2);
                if (numH4 != null) {
                    pp4Var.B = numH4;
                }
                break;
            case 8:
                pp4Var.d = str2;
                break;
            case 9:
                pp4Var.b = str2;
                break;
        }
    }

    @Override // defpackage.iv4
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ib9.class == obj.getClass()) {
            ib9 ib9Var = (ib9) obj;
            if (this.a.equals(ib9Var.a) && this.b.equals(ib9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + rm7.k(this.a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.a + SimpleComparison.EQUAL_TO_OPERATION + this.b;
    }
}
