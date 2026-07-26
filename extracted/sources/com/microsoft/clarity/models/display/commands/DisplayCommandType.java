package com.microsoft.clarity.models.display.commands;

import com.microsoft.clarity.protomodels.mutationpayload.EnumC0134p;

/* JADX INFO: loaded from: classes3.dex */
public enum DisplayCommandType {
    ClipRect,
    Concat,
    Concat44,
    DrawArc,
    DrawBehindPaint,
    DrawDRRect,
    DrawImage,
    DrawImageLattice,
    DrawImageNine,
    DrawImageRect,
    DrawPaint,
    DrawPath,
    DrawRect,
    Translate,
    DrawOval,
    DrawPoints,
    DrawRRect,
    DrawTextBlob,
    DrawVertices,
    DrawViewEndAnnotation,
    DrawViewStartAnnotation,
    Restore,
    Save,
    SaveBehind,
    SaveLayer,
    Scale,
    SetMatrix,
    SetMatrix44,
    ClipPath,
    ClipRRect,
    DrawViewContentEndAnnotation,
    DrawViewContentStartAnnotation,
    FillViewCommandsAnnotation;

    public final EnumC0134p toProtobufType() {
        return EnumC0134p.a(ordinal());
    }
}
