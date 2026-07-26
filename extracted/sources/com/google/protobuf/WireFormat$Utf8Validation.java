package com.google.protobuf;

import defpackage.lu0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
abstract class WireFormat$Utf8Validation {
    public static final AnonymousClass1 a;
    public static final /* synthetic */ WireFormat$Utf8Validation[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.WireFormat$Utf8Validation$1] */
    static {
        ?? r0 = new WireFormat$Utf8Validation() { // from class: com.google.protobuf.WireFormat$Utf8Validation.1
            @Override // com.google.protobuf.WireFormat$Utf8Validation
            public final Object a(lu0 lu0Var) {
                return lu0Var.D();
            }
        };
        a = r0;
        b = new WireFormat$Utf8Validation[]{r0, new WireFormat$Utf8Validation() { // from class: com.google.protobuf.WireFormat$Utf8Validation.2
            @Override // com.google.protobuf.WireFormat$Utf8Validation
            public final Object a(lu0 lu0Var) {
                return lu0Var.E();
            }
        }, new WireFormat$Utf8Validation() { // from class: com.google.protobuf.WireFormat$Utf8Validation.3
            @Override // com.google.protobuf.WireFormat$Utf8Validation
            public final Object a(lu0 lu0Var) {
                return lu0Var.n();
            }
        }};
    }

    public static WireFormat$Utf8Validation valueOf(String str) {
        return (WireFormat$Utf8Validation) java.lang.Enum.valueOf(WireFormat$Utf8Validation.class, str);
    }

    public static WireFormat$Utf8Validation[] values() {
        return (WireFormat$Utf8Validation[]) b.clone();
    }

    public abstract Object a(lu0 lu0Var);
}
