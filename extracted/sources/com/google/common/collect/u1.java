package com.google.common.collect;

import defpackage.s7;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            Tables$ImmutableCell tables$ImmutableCell = (Tables$ImmutableCell) this;
            Tables$ImmutableCell tables$ImmutableCell2 = (Tables$ImmutableCell) ((u1) obj);
            if (s7.l(tables$ImmutableCell.a, tables$ImmutableCell2.a) && s7.l(tables$ImmutableCell.b, tables$ImmutableCell2.b) && s7.l(tables$ImmutableCell.c, tables$ImmutableCell2.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Tables$ImmutableCell tables$ImmutableCell = (Tables$ImmutableCell) this;
        return Arrays.hashCode(new Object[]{tables$ImmutableCell.a, tables$ImmutableCell.b, tables$ImmutableCell.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        Tables$ImmutableCell tables$ImmutableCell = (Tables$ImmutableCell) this;
        sb.append(tables$ImmutableCell.a);
        sb.append(",");
        sb.append(tables$ImmutableCell.b);
        sb.append(")=");
        sb.append(tables$ImmutableCell.c);
        return sb.toString();
    }
}
