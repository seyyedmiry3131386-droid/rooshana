package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.lr3;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0134p implements lr3 {
    ClipRect(0),
    Concat(1),
    Concat44(2),
    DrawArc(3),
    DrawBehindPaint(4),
    DrawDRRect(5),
    DrawImage(6),
    DrawImageLattice(7),
    DrawImageNine(8),
    DrawImageRect(9),
    DrawPaint(10),
    DrawPath(11),
    DrawRect(12),
    Translate(13),
    DrawOval(14),
    DrawPoints(15),
    DrawRRect(16),
    DrawTextBlob(17),
    DrawVertices(18),
    DrawViewEndAnnotation(19),
    DrawViewStartAnnotation(20),
    Restore(21),
    Save(22),
    SaveBehind(23),
    SaveLayer(24),
    Scale(25),
    SetMatrix(26),
    SetMatrix44(27),
    ClipPath(28),
    ClipRRect(29),
    DrawViewContentEndAnnotation(30),
    DrawViewContentStartAnnotation(31),
    FillViewCommandsAnnotation(32),
    DrawAtlas(33),
    DrawCircle(34),
    DrawColor(35),
    DrawLine(36),
    DrawRenderParagraph(37),
    DrawRawAtlas(38),
    DrawRawPoints(39),
    DrawShadow(40),
    RestoreToCount(41),
    Rotate(42),
    Skew(43),
    Transform(44),
    ErrorViewAnnotation(45),
    DrawRenderEditable(46),
    UNRECOGNIZED(-1);

    public final int a;

    EnumC0134p(int i) {
        this.a = i;
    }

    public static EnumC0134p a(int i) {
        switch (i) {
            case 0:
                return ClipRect;
            case 1:
                return Concat;
            case 2:
                return Concat44;
            case 3:
                return DrawArc;
            case 4:
                return DrawBehindPaint;
            case 5:
                return DrawDRRect;
            case 6:
                return DrawImage;
            case 7:
                return DrawImageLattice;
            case 8:
                return DrawImageNine;
            case 9:
                return DrawImageRect;
            case 10:
                return DrawPaint;
            case 11:
                return DrawPath;
            case 12:
                return DrawRect;
            case 13:
                return Translate;
            case 14:
                return DrawOval;
            case 15:
                return DrawPoints;
            case 16:
                return DrawRRect;
            case 17:
                return DrawTextBlob;
            case 18:
                return DrawVertices;
            case 19:
                return DrawViewEndAnnotation;
            case 20:
                return DrawViewStartAnnotation;
            case 21:
                return Restore;
            case 22:
                return Save;
            case 23:
                return SaveBehind;
            case 24:
                return SaveLayer;
            case 25:
                return Scale;
            case 26:
                return SetMatrix;
            case 27:
                return SetMatrix44;
            case 28:
                return ClipPath;
            case 29:
                return ClipRRect;
            case 30:
                return DrawViewContentEndAnnotation;
            case 31:
                return DrawViewContentStartAnnotation;
            case 32:
                return FillViewCommandsAnnotation;
            case 33:
                return DrawAtlas;
            case 34:
                return DrawCircle;
            case 35:
                return DrawColor;
            case 36:
                return DrawLine;
            case 37:
                return DrawRenderParagraph;
            case 38:
                return DrawRawAtlas;
            case 39:
                return DrawRawPoints;
            case 40:
                return DrawShadow;
            case 41:
                return RestoreToCount;
            case 42:
                return Rotate;
            case 43:
                return Skew;
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                return Transform;
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                return ErrorViewAnnotation;
            case 46:
                return DrawRenderEditable;
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
