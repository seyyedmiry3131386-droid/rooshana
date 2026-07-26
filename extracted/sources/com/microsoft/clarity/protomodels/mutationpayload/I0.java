package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.lr3;

/* JADX INFO: loaded from: classes3.dex */
public enum I0 implements lr3 {
    AddRRectPathVerb(0),
    ClosePathVerb(1),
    ConicPathVerb(2),
    CubicPathVerb(3),
    DonePathVerb(4),
    LinePathVerb(5),
    MovePathVerb(6),
    QuadPathVerb(7),
    UNRECOGNIZED(-1);

    public final int a;

    I0(int i) {
        this.a = i;
    }

    public static I0 a(int i) {
        switch (i) {
            case 0:
                return AddRRectPathVerb;
            case 1:
                return ClosePathVerb;
            case 2:
                return ConicPathVerb;
            case 3:
                return CubicPathVerb;
            case 4:
                return DonePathVerb;
            case 5:
                return LinePathVerb;
            case 6:
                return MovePathVerb;
            case 7:
                return QuadPathVerb;
            default:
                return null;
        }
    }

    @Override // defpackage.lr3
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
