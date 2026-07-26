package com.microsoft.clarity.p;

import defpackage.dp2;
import defpackage.js3;
import defpackage.m91;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import j$.util.stream.Stream;
import java.io.File;
import java.nio.file.Files;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements dp2 {
    public static final a a = new a();

    public a() {
        super(1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws Exception {
        File file = (File) obj;
        js3.p(file, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        if (!file.isDirectory()) {
            return Boolean.FALSE;
        }
        Stream streamConvert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
        try {
            Boolean boolValueOf = Boolean.valueOf(!streamConvert.findFirst().isPresent());
            m91.i(streamConvert, null);
            return boolValueOf;
        } finally {
        }
    }
}
