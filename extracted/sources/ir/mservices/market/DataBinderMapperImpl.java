package ir.mservices.market;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.insets.ProtectionLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.loadingindicator.LoadingIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.jsibbold.zoomage.ZoomageView;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.a19;
import defpackage.a23;
import defpackage.a25;
import defpackage.a29;
import defpackage.a33;
import defpackage.a43;
import defpackage.a53;
import defpackage.a69;
import defpackage.a7;
import defpackage.a73;
import defpackage.a79;
import defpackage.a83;
import defpackage.a93;
import defpackage.a99;
import defpackage.ac0;
import defpackage.ae5;
import defpackage.ag5;
import defpackage.aj7;
import defpackage.al3;
import defpackage.as6;
import defpackage.b13;
import defpackage.b23;
import defpackage.b25;
import defpackage.b63;
import defpackage.b73;
import defpackage.b78;
import defpackage.b83;
import defpackage.b95;
import defpackage.ba1;
import defpackage.ba3;
import defpackage.bd5;
import defpackage.bl2;
import defpackage.bn2;
import defpackage.bo2;
import defpackage.br7;
import defpackage.by5;
import defpackage.c13;
import defpackage.c19;
import defpackage.c23;
import defpackage.c25;
import defpackage.c33;
import defpackage.c43;
import defpackage.c46;
import defpackage.c53;
import defpackage.c93;
import defpackage.c95;
import defpackage.ca1;
import defpackage.ca3;
import defpackage.cd5;
import defpackage.cm1;
import defpackage.cm3;
import defpackage.co2;
import defpackage.co7;
import defpackage.cw4;
import defpackage.d12;
import defpackage.d23;
import defpackage.d53;
import defpackage.d63;
import defpackage.d73;
import defpackage.d83;
import defpackage.d93;
import defpackage.d95;
import defpackage.d97;
import defpackage.df5;
import defpackage.dl2;
import defpackage.dq;
import defpackage.dv6;
import defpackage.dx6;
import defpackage.dz6;
import defpackage.dz8;
import defpackage.e13;
import defpackage.e15;
import defpackage.e19;
import defpackage.e25;
import defpackage.e33;
import defpackage.e43;
import defpackage.e46;
import defpackage.e5;
import defpackage.e75;
import defpackage.e78;
import defpackage.e83;
import defpackage.e86;
import defpackage.e93;
import defpackage.e95;
import defpackage.e97;
import defpackage.ea1;
import defpackage.ea2;
import defpackage.ea3;
import defpackage.ec3;
import defpackage.em1;
import defpackage.em3;
import defpackage.ev6;
import defpackage.ew7;
import defpackage.f11;
import defpackage.f13;
import defpackage.f23;
import defpackage.f25;
import defpackage.f33;
import defpackage.f38;
import defpackage.f43;
import defpackage.f46;
import defpackage.f50;
import defpackage.f53;
import defpackage.f54;
import defpackage.f56;
import defpackage.f63;
import defpackage.f73;
import defpackage.f83;
import defpackage.f93;
import defpackage.fa3;
import defpackage.fd5;
import defpackage.fi7;
import defpackage.fz6;
import defpackage.fz8;
import defpackage.g04;
import defpackage.g43;
import defpackage.g63;
import defpackage.g73;
import defpackage.g83;
import defpackage.g92;
import defpackage.gb3;
import defpackage.gh3;
import defpackage.gl2;
import defpackage.gm1;
import defpackage.gs0;
import defpackage.gw;
import defpackage.h05;
import defpackage.h07;
import defpackage.h13;
import defpackage.h23;
import defpackage.h33;
import defpackage.h46;
import defpackage.h47;
import defpackage.h5;
import defpackage.h53;
import defpackage.h55;
import defpackage.h63;
import defpackage.h65;
import defpackage.h86;
import defpackage.h92;
import defpackage.h93;
import defpackage.ha3;
import defpackage.hb3;
import defpackage.hl3;
import defpackage.hr7;
import defpackage.hw0;
import defpackage.hy4;
import defpackage.hz6;
import defpackage.hz8;
import defpackage.i23;
import defpackage.i33;
import defpackage.i4;
import defpackage.i43;
import defpackage.i46;
import defpackage.i53;
import defpackage.i63;
import defpackage.i68;
import defpackage.i73;
import defpackage.i79;
import defpackage.i83;
import defpackage.ic5;
import defpackage.ii5;
import defpackage.il2;
import defpackage.im1;
import defpackage.iq1;
import defpackage.is0;
import defpackage.j06;
import defpackage.j13;
import defpackage.j43;
import defpackage.j54;
import defpackage.j65;
import defpackage.j7;
import defpackage.j79;
import defpackage.j86;
import defpackage.j93;
import defpackage.ja3;
import defpackage.jf5;
import defpackage.jh7;
import defpackage.ji0;
import defpackage.ji6;
import defpackage.jj2;
import defpackage.jl1;
import defpackage.jm1;
import defpackage.jm2;
import defpackage.js6;
import defpackage.jw0;
import defpackage.jz6;
import defpackage.k12;
import defpackage.k15;
import defpackage.k23;
import defpackage.k33;
import defpackage.k46;
import defpackage.k5;
import defpackage.k53;
import defpackage.k63;
import defpackage.k73;
import defpackage.k78;
import defpackage.k83;
import defpackage.k92;
import defpackage.ka2;
import defpackage.ka9;
import defpackage.kc2;
import defpackage.kc3;
import defpackage.ki0;
import defpackage.kk8;
import defpackage.kl1;
import defpackage.kn1;
import defpackage.kr7;
import defpackage.kz3;
import defpackage.l12;
import defpackage.l13;
import defpackage.l15;
import defpackage.l23;
import defpackage.l43;
import defpackage.l55;
import defpackage.l63;
import defpackage.l77;
import defpackage.l83;
import defpackage.l84;
import defpackage.l93;
import defpackage.la3;
import defpackage.lc;
import defpackage.lc2;
import defpackage.lf5;
import defpackage.lg5;
import defpackage.lh7;
import defpackage.li6;
import defpackage.lj7;
import defpackage.lk8;
import defpackage.ll3;
import defpackage.lm1;
import defpackage.lm2;
import defpackage.ln5;
import defpackage.lp3;
import defpackage.m05;
import defpackage.m15;
import defpackage.m17;
import defpackage.m33;
import defpackage.m53;
import defpackage.m55;
import defpackage.m73;
import defpackage.m76;
import defpackage.m77;
import defpackage.m83;
import defpackage.ma5;
import defpackage.mc2;
import defpackage.mc5;
import defpackage.me7;
import defpackage.mf8;
import defpackage.mi0;
import defpackage.mm7;
import defpackage.mn1;
import defpackage.mz8;
import defpackage.n13;
import defpackage.n23;
import defpackage.n43;
import defpackage.n5;
import defpackage.n53;
import defpackage.n63;
import defpackage.n93;
import defpackage.na2;
import defpackage.na3;
import defpackage.na5;
import defpackage.na9;
import defpackage.nc;
import defpackage.nc4;
import defpackage.nd;
import defpackage.nj7;
import defpackage.nk1;
import defpackage.nk8;
import defpackage.nl2;
import defpackage.nl5;
import defpackage.nm1;
import defpackage.nn1;
import defpackage.nq;
import defpackage.nt7;
import defpackage.o07;
import defpackage.o17;
import defpackage.o33;
import defpackage.o40;
import defpackage.o60;
import defpackage.o63;
import defpackage.o73;
import defpackage.o83;
import defpackage.o92;
import defpackage.ob9;
import defpackage.om;
import defpackage.om2;
import defpackage.on1;
import defpackage.op8;
import defpackage.or;
import defpackage.ot7;
import defpackage.p13;
import defpackage.p23;
import defpackage.p43;
import defpackage.p5;
import defpackage.p53;
import defpackage.p73;
import defpackage.p83;
import defpackage.p93;
import defpackage.pa3;
import defpackage.pa9;
import defpackage.pc;
import defpackage.pd5;
import defpackage.pj7;
import defpackage.pm1;
import defpackage.pn1;
import defpackage.pt;
import defpackage.px7;
import defpackage.q23;
import defpackage.q33;
import defpackage.q43;
import defpackage.q63;
import defpackage.q7;
import defpackage.q73;
import defpackage.qk8;
import defpackage.qm;
import defpackage.qm2;
import defpackage.qm8;
import defpackage.r07;
import defpackage.r13;
import defpackage.r53;
import defpackage.r63;
import defpackage.r73;
import defpackage.r76;
import defpackage.r83;
import defpackage.r93;
import defpackage.r98;
import defpackage.rd5;
import defpackage.rg4;
import defpackage.ri0;
import defpackage.rl1;
import defpackage.rn1;
import defpackage.rn2;
import defpackage.rp;
import defpackage.rt;
import defpackage.rw6;
import defpackage.s13;
import defpackage.s23;
import defpackage.s28;
import defpackage.s33;
import defpackage.s43;
import defpackage.s63;
import defpackage.s65;
import defpackage.s68;
import defpackage.s73;
import defpackage.s83;
import defpackage.s89;
import defpackage.s98;
import defpackage.se7;
import defpackage.se8;
import defpackage.sm2;
import defpackage.sn1;
import defpackage.sn2;
import defpackage.so5;
import defpackage.sp;
import defpackage.st;
import defpackage.sx2;
import defpackage.sz8;
import defpackage.t4;
import defpackage.t53;
import defpackage.t55;
import defpackage.t63;
import defpackage.t73;
import defpackage.t93;
import defpackage.tg5;
import defpackage.tl5;
import defpackage.tl6;
import defpackage.tn8;
import defpackage.tq7;
import defpackage.tr1;
import defpackage.tt;
import defpackage.tw6;
import defpackage.tz8;
import defpackage.u13;
import defpackage.u23;
import defpackage.u33;
import defpackage.u43;
import defpackage.u53;
import defpackage.u68;
import defpackage.u73;
import defpackage.u76;
import defpackage.u77;
import defpackage.u83;
import defpackage.u89;
import defpackage.u93;
import defpackage.um2;
import defpackage.un1;
import defpackage.un2;
import defpackage.ut;
import defpackage.uw7;
import defpackage.v60;
import defpackage.v63;
import defpackage.v75;
import defpackage.v83;
import defpackage.v92;
import defpackage.v93;
import defpackage.vb3;
import defpackage.vf7;
import defpackage.vh7;
import defpackage.vi2;
import defpackage.vi7;
import defpackage.vk2;
import defpackage.vm1;
import defpackage.vn2;
import defpackage.vn8;
import defpackage.vo2;
import defpackage.vq2;
import defpackage.vs0;
import defpackage.vw6;
import defpackage.vw7;
import defpackage.w13;
import defpackage.w17;
import defpackage.w23;
import defpackage.w31;
import defpackage.w33;
import defpackage.w41;
import defpackage.w43;
import defpackage.w49;
import defpackage.w53;
import defpackage.w73;
import defpackage.w83;
import defpackage.w89;
import defpackage.wb0;
import defpackage.wb3;
import defpackage.wd0;
import defpackage.we5;
import defpackage.wn1;
import defpackage.wq7;
import defpackage.wu4;
import defpackage.x04;
import defpackage.x17;
import defpackage.x63;
import defpackage.x65;
import defpackage.x69;
import defpackage.x75;
import defpackage.x90;
import defpackage.x93;
import defpackage.xe5;
import defpackage.xk2;
import defpackage.xm1;
import defpackage.xn2;
import defpackage.xu6;
import defpackage.xv4;
import defpackage.xx2;
import defpackage.y07;
import defpackage.y13;
import defpackage.y14;
import defpackage.y23;
import defpackage.y33;
import defpackage.y43;
import defpackage.y53;
import defpackage.y73;
import defpackage.y79;
import defpackage.y83;
import defpackage.y87;
import defpackage.yc;
import defpackage.yc5;
import defpackage.yg3;
import defpackage.yk2;
import defpackage.yl3;
import defpackage.yn1;
import defpackage.yn6;
import defpackage.yn7;
import defpackage.yo5;
import defpackage.yp8;
import defpackage.yz8;
import defpackage.z05;
import defpackage.z14;
import defpackage.z43;
import defpackage.z53;
import defpackage.z63;
import defpackage.z87;
import defpackage.z93;
import defpackage.zl2;
import defpackage.zx2;
import ir.mservices.market.movie.download.MovieDownloadButton;
import ir.mservices.market.social.list.common.ProfileSearchView;
import ir.mservices.market.social.mynet.view.UserInfoTagsView;
import ir.mservices.market.social.profile.common.ProfileTabView;
import ir.mservices.market.social.profile.common.RelationView;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.views.AlphaAnimationView;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.AppSummeryView;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.BigEmptyOvalButton;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.BigFillRectangleButton;
import ir.mservices.market.views.BigMovieOvalButton;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.BindAutoCompleteView;
import ir.mservices.market.views.BirthdayPicker;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogButtonComponentVertical;
import ir.mservices.market.views.DialogButtonLayout;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.DownloadProgressBar;
import ir.mservices.market.views.ElasticFrameLayout;
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;
import ir.mservices.market.views.ExtendedViewPager;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.FlowLayoutView;
import ir.mservices.market.views.HorizontalRecyclerView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MovieNewTagView;
import ir.mservices.market.views.MovieTabView;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketInputLayout;
import ir.mservices.market.views.MyketMultiRadio;
import ir.mservices.market.views.MyketNoPaddingTextView;
import ir.mservices.market.views.MyketRadioButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketSwitch;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.MyketVideoView;
import ir.mservices.market.views.MyketWebView;
import ir.mservices.market.views.NumberPickerView;
import ir.mservices.market.views.PaymentPriceView;
import ir.mservices.market.views.PikaReceiveView;
import ir.mservices.market.views.RippleBackground;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.mservices.market.views.SmallEmptyLargeTextOvalButton;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillBorderOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;
import ir.mservices.market.views.SmallMovieOvalButton;
import ir.mservices.market.views.SmallRegularTextButton;
import ir.mservices.market.views.TryAgainView;
import java.util.ArrayList;
import java.util.List;
import me.relex.circleindicator.CircleIndicator;

/* JADX INFO: loaded from: classes3.dex */
public class DataBinderMapperImpl extends ba1 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(423);
        a = sparseIntArray;
        sparseIntArray.put(js6.account_change_info_bottom, 1);
        sparseIntArray.put(js6.account_link_item, 2);
        sparseIntArray.put(js6.account_nick_name, 3);
        sparseIntArray.put(js6.account_private_mode_item, 4);
        sparseIntArray.put(js6.account_username, 5);
        sparseIntArray.put(js6.achievement_item, 6);
        sparseIntArray.put(js6.achivement_title, 7);
        sparseIntArray.put(js6.activity_comment, 8);
        sparseIntArray.put(js6.activity_intro, 9);
        sparseIntArray.put(js6.activity_reels, 10);
        sparseIntArray.put(js6.addax_box_one, 11);
        sparseIntArray.put(js6.addax_box_three, 12);
        sparseIntArray.put(js6.addax_box_two, 13);
        sparseIntArray.put(js6.ai_review, 14);
        sparseIntArray.put(js6.alert_dialog_bottom, 15);
        sparseIntArray.put(js6.app_card, 16);
        sparseIntArray.put(js6.app_card_digested, 17);
        sparseIntArray.put(js6.app_detail_suggestion_place, 18);
        sparseIntArray.put(js6.app_download_active_holder, 19);
        sparseIntArray.put(js6.app_info_view, 20);
        sparseIntArray.put(js6.app_not_found, 21);
        sparseIntArray.put(js6.app_summery_icon, 22);
        sparseIntArray.put(js6.app_summery_rate, 23);
        sparseIntArray.put(js6.app_summery_size, 24);
        sparseIntArray.put(js6.app_summery_text, 25);
        sparseIntArray.put(js6.app_summery_view, 26);
        sparseIntArray.put(js6.arrow_dialog_component, 27);
        sparseIntArray.put(js6.badge_text, 28);
        sparseIntArray.put(js6.base_content_layout, 29);
        sparseIntArray.put(js6.base_draggable_fragment, 30);
        sparseIntArray.put(js6.base_video_fragment, 31);
        sparseIntArray.put(js6.birthday_animation_view, 32);
        sparseIntArray.put(js6.birthday_dialog, 33);
        sparseIntArray.put(js6.bookmarks_list, 34);
        sparseIntArray.put(js6.buttons_dialog, 35);
        sparseIntArray.put(js6.buttons_dialog_component, 36);
        sparseIntArray.put(js6.buttons_dialog_component_vertical, 37);
        sparseIntArray.put(js6.buzz_progress_image_view, 38);
        sparseIntArray.put(js6.city_footer, 39);
        sparseIntArray.put(js6.city_header, 40);
        sparseIntArray.put(js6.clear_all_dialogs, 41);
        sparseIntArray.put(js6.comment, 42);
        sparseIntArray.put(js6.comment_dialog, 43);
        sparseIntArray.put(js6.confirm_dialog, 44);
        sparseIntArray.put(js6.content_fragment, 45);
        sparseIntArray.put(js6.content_web_view_fragment, 46);
        sparseIntArray.put(js6.detail_toolbar_view, 47);
        sparseIntArray.put(js6.developer_info_view, 48);
        sparseIntArray.put(js6.developer_page_title_view, 49);
        sparseIntArray.put(js6.developer_title_view, 50);
        sparseIntArray.put(js6.dialog_alert_app_install_failed, 51);
        sparseIntArray.put(js6.dialog_app_failed_storage_install, 52);
        sparseIntArray.put(js6.dialog_app_install, 53);
        sparseIntArray.put(js6.dialog_app_progress, 54);
        sparseIntArray.put(js6.dialog_app_retry_install, 55);
        sparseIntArray.put(js6.dialog_app_sign_not_matched, 56);
        sparseIntArray.put(js6.dialog_app_un_success_install, 57);
        sparseIntArray.put(js6.dialog_credit, 58);
        sparseIntArray.put(js6.dialog_custom_list_title, 59);
        sparseIntArray.put(js6.dialog_in_app_notification, 60);
        sparseIntArray.put(js6.dialog_login, 61);
        sparseIntArray.put(js6.dialog_payment_retry, 62);
        sparseIntArray.put(js6.dialog_permission_document_file, 63);
        sparseIntArray.put(js6.dialog_profile_add_list, 64);
        sparseIntArray.put(js6.dialog_progress, 65);
        sparseIntArray.put(js6.divider, 66);
        sparseIntArray.put(js6.download_content_fragment, 67);
        sparseIntArray.put(js6.empty_card, 68);
        sparseIntArray.put(js6.empty_city_view, 69);
        sparseIntArray.put(js6.empty_view_button, 70);
        sparseIntArray.put(js6.feedback_attach_content_item, 71);
        sparseIntArray.put(js6.feedback_body_edit_text_item, 72);
        sparseIntArray.put(js6.feedback_choose_topoic_item, 73);
        sparseIntArray.put(js6.feedback_dialog_transition, 74);
        sparseIntArray.put(js6.feedback_phone_number_item, 75);
        sparseIntArray.put(js6.feedback_transaction_content_fragment, 76);
        sparseIntArray.put(js6.feedback_transaction_header, 77);
        sparseIntArray.put(js6.feedback_transaction_item, 78);
        sparseIntArray.put(js6.feedback_transaction_view_item, 79);
        sparseIntArray.put(js6.filter_view, 80);
        sparseIntArray.put(js6.font_style_dialog, 81);
        sparseIntArray.put(js6.footer_row_vertical, 82);
        sparseIntArray.put(js6.fragment_ad_guard, 83);
        sparseIntArray.put(js6.fragment_add_custom_list, 84);
        sparseIntArray.put(js6.fragment_cheetah, 85);
        sparseIntArray.put(js6.fragment_crop, 86);
        sparseIntArray.put(js6.fragment_intro, 87);
        sparseIntArray.put(js6.fragment_intro_notification, 88);
        sparseIntArray.put(js6.fragment_login, 89);
        sparseIntArray.put(js6.fragment_movie_seasons, 90);
        sparseIntArray.put(js6.fragment_own_profile, 91);
        sparseIntArray.put(js6.fragment_reels, 92);
        sparseIntArray.put(js6.fragment_search, 93);
        sparseIntArray.put(js6.fragment_search_result, 94);
        sparseIntArray.put(js6.fragment_send_app_detail, 95);
        sparseIntArray.put(js6.fragment_single_image, 96);
        sparseIntArray.put(js6.fragment_togo, 97);
        sparseIntArray.put(js6.fragment_try_again, 98);
        sparseIntArray.put(js6.fragment_unbind_all_bind_state, 99);
        sparseIntArray.put(js6.fragment_verify_bind_state, 100);
        sparseIntArray.put(js6.fragment_welcome, 101);
        sparseIntArray.put(js6.full_screenshot, 102);
        sparseIntArray.put(js6.gateway_view, 103);
        sparseIntArray.put(js6.header_dialog_component, 104);
        sparseIntArray.put(js6.header_reviews, 105);
        sparseIntArray.put(js6.header_reviews_info, 106);
        sparseIntArray.put(js6.holder_age_rate, 107);
        sparseIntArray.put(js6.holder_answer, 108);
        sparseIntArray.put(js6.holder_app_download, 109);
        sparseIntArray.put(js6.holder_app_product, 110);
        sparseIntArray.put(js6.holder_app_screenshot, 111);
        sparseIntArray.put(js6.holder_app_summary, 112);
        sparseIntArray.put(js6.holder_app_tags, 113);
        sparseIntArray.put(js6.holder_application, 114);
        sparseIntArray.put(js6.holder_avatar_preview, 115);
        sparseIntArray.put(js6.holder_complete_review_item, 116);
        sparseIntArray.put(js6.holder_custom_list_add, 117);
        sparseIntArray.put(js6.holder_custom_list_add_title, 118);
        sparseIntArray.put(js6.holder_custom_list_buttons, 119);
        sparseIntArray.put(js6.holder_custom_list_empty, 120);
        sparseIntArray.put(js6.holder_custom_list_title, 121);
        sparseIntArray.put(js6.holder_description, 122);
        sparseIntArray.put(js6.holder_download_quality_title, 123);
        sparseIntArray.put(js6.holder_ext_header_app, 124);
        sparseIntArray.put(js6.holder_ext_header_clickable, 125);
        sparseIntArray.put(js6.holder_font_item, 126);
        sparseIntArray.put(js6.holder_grid_shimmer_reels, 127);
        sparseIntArray.put(js6.holder_half_price_notice, 128);
        sparseIntArray.put(js6.holder_harmful_app, 129);
        sparseIntArray.put(js6.holder_home_app_review, 130);
        sparseIntArray.put(js6.holder_home_banner_app_inner, 131);
        sparseIntArray.put(js6.holder_home_banner_app_inner_digested, 132);
        sparseIntArray.put(js6.holder_home_banner_app_outer, 133);
        sparseIntArray.put(js6.holder_home_banner_app_outer_digested, 134);
        sparseIntArray.put(js6.holder_home_top_banner, 135);
        sparseIntArray.put(js6.holder_huge_banner, 136);
        sparseIntArray.put(js6.holder_incomplete_review, 137);
        sparseIntArray.put(js6.holder_installed_app, 138);
        sparseIntArray.put(js6.holder_installed_app_title, 139);
        sparseIntArray.put(js6.holder_installed_app_usage, 140);
        sparseIntArray.put(js6.holder_intro_item, 141);
        sparseIntArray.put(js6.holder_large_shimmer_banners, 142);
        sparseIntArray.put(js6.holder_large_shimmer_movies, 143);
        sparseIntArray.put(js6.holder_large_shimmer_reels, 144);
        sparseIntArray.put(js6.holder_last_version_note, 145);
        sparseIntArray.put(js6.holder_manage_update_schedule, 146);
        sparseIntArray.put(js6.holder_medium_movie_horizontal_list, 147);
        sparseIntArray.put(js6.holder_medium_shimmer_banners, 148);
        sparseIntArray.put(js6.holder_medium_shimmer_movies, 149);
        sparseIntArray.put(js6.holder_medium_shimmer_reels, 150);
        sparseIntArray.put(js6.holder_more_clickable, 151);
        sparseIntArray.put(js6.holder_more_information, 152);
        sparseIntArray.put(js6.holder_more_size, 153);
        sparseIntArray.put(js6.holder_more_streamers, 154);
        sparseIntArray.put(js6.holder_more_version, ModuleDescriptor.MODULE_VERSION);
        sparseIntArray.put(js6.holder_movie_banner, 156);
        sparseIntArray.put(js6.holder_movie_banners_item, 157);
        sparseIntArray.put(js6.holder_movie_bookmark, 158);
        sparseIntArray.put(js6.holder_movie_cast_title, 159);
        sparseIntArray.put(js6.holder_movie_download_episode, 160);
        sparseIntArray.put(js6.holder_movie_download_item, 161);
        sparseIntArray.put(js6.holder_movie_episode, 162);
        sparseIntArray.put(js6.holder_movie_episode_more, 163);
        sparseIntArray.put(js6.holder_movie_horizontal_banner_list, 164);
        sparseIntArray.put(js6.holder_movie_horizontal_large_banner_list, 165);
        sparseIntArray.put(js6.holder_movie_horizontal_list, 166);
        sparseIntArray.put(js6.holder_movie_horizontal_medium_banner_list, 167);
        sparseIntArray.put(js6.holder_movie_image_background_horizontal_list, 168);
        sparseIntArray.put(js6.holder_movie_list_title, 169);
        sparseIntArray.put(js6.holder_movie_multi_select_bookmark, 170);
        sparseIntArray.put(js6.holder_movie_review, 171);
        sparseIntArray.put(js6.holder_movie_review_more, 172);
        sparseIntArray.put(js6.holder_movie_screenshot, 173);
        sparseIntArray.put(js6.holder_movie_screenshots, 174);
        sparseIntArray.put(js6.holder_movie_season_title, 175);
        sparseIntArray.put(js6.holder_movie_single_movie, 176);
        sparseIntArray.put(js6.holder_movie_tablet_banner, 177);
        sparseIntArray.put(js6.holder_movie_trailer, 178);
        sparseIntArray.put(js6.holder_multi_select_bookmark, 179);
        sparseIntArray.put(js6.holder_multi_select_download, 180);
        sparseIntArray.put(js6.holder_my_myket_new, 181);
        sparseIntArray.put(js6.holder_new_version_header, 182);
        sparseIntArray.put(js6.holder_new_version_row, 183);
        sparseIntArray.put(js6.holder_other_streamer, 184);
        sparseIntArray.put(js6.holder_other_streamer_row, 185);
        sparseIntArray.put(js6.holder_own_profile_action, 186);
        sparseIntArray.put(js6.holder_own_profile_follow_request, 187);
        sparseIntArray.put(js6.holder_own_profile_header, 188);
        sparseIntArray.put(js6.holder_own_profile_info, 189);
        sparseIntArray.put(js6.holder_own_profile_tip, 190);
        sparseIntArray.put(js6.holder_own_review, 191);
        sparseIntArray.put(js6.holder_play_description, 192);
        sparseIntArray.put(js6.holder_play_detail_app_summery, 193);
        sparseIntArray.put(js6.holder_play_detail_info, 194);
        sparseIntArray.put(js6.holder_play_detail_suggest, 195);
        sparseIntArray.put(js6.holder_play_screenshot, 196);
        sparseIntArray.put(js6.holder_play_screenshot_list, 197);
        sparseIntArray.put(js6.holder_quality_select_item, 198);
        sparseIntArray.put(js6.holder_question, 199);
        sparseIntArray.put(js6.holder_recent_download, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        sparseIntArray.put(js6.holder_reel_horizontal_grid_list, 201);
        sparseIntArray.put(js6.holder_reel_horizontal_large_list, 202);
        sparseIntArray.put(js6.holder_reel_horizontal_medium_list, 203);
        sparseIntArray.put(js6.holder_reel_horizontal_small_list, 204);
        sparseIntArray.put(js6.holder_reel_list_title, 205);
        sparseIntArray.put(js6.holder_requests_item, 206);
        sparseIntArray.put(js6.holder_scan_device, 207);
        sparseIntArray.put(js6.holder_scan_tip, 208);
        sparseIntArray.put(js6.holder_schedule_time, 209);
        sparseIntArray.put(js6.holder_schedule_tip, 210);
        sparseIntArray.put(js6.holder_schedule_type, 211);
        sparseIntArray.put(js6.holder_screenshot, 212);
        sparseIntArray.put(js6.holder_search_app, 213);
        sparseIntArray.put(js6.holder_search_tag, 214);
        sparseIntArray.put(js6.holder_search_term, 215);
        sparseIntArray.put(js6.holder_select_city_item, 216);
        sparseIntArray.put(js6.holder_select_city_title_item, 217);
        sparseIntArray.put(js6.holder_selected_list_add, 218);
        sparseIntArray.put(js6.holder_shimmer_application_horizontal, 219);
        sparseIntArray.put(js6.holder_shimmer_application_vertical, 220);
        sparseIntArray.put(js6.holder_shimmer_application_vertical_digested, 221);
        sparseIntArray.put(js6.holder_shimmer_header, 222);
        sparseIntArray.put(js6.holder_shimmer_movies_bg, 223);
        sparseIntArray.put(js6.holder_shimmer_review, 224);
        sparseIntArray.put(js6.holder_shimmer_single_app, 225);
        sparseIntArray.put(js6.holder_small_movie_horizontal_list, 226);
        sparseIntArray.put(js6.holder_small_shimmer_banners, 227);
        sparseIntArray.put(js6.holder_small_shimmer_movies, 228);
        sparseIntArray.put(js6.holder_small_shimmer_reels, 229);
        sparseIntArray.put(js6.holder_social_app, 230);
        sparseIntArray.put(js6.holder_social_movie, 231);
        sparseIntArray.put(js6.holder_streamer_movie, 232);
        sparseIntArray.put(js6.holder_streamer_movie_title, 233);
        sparseIntArray.put(js6.holder_streamer_movies_more, 234);
        sparseIntArray.put(js6.holder_subreview_title, 235);
        sparseIntArray.put(js6.holder_suggest, 236);
        sparseIntArray.put(js6.holder_theme_style, 237);
        sparseIntArray.put(js6.holder_user_profile_action, 238);
        sparseIntArray.put(js6.holder_users_empty_view, 239);
        sparseIntArray.put(js6.holder_video_shot, 240);
        sparseIntArray.put(js6.holder_welcome_birthday, 241);
        sparseIntArray.put(js6.holder_welcome_gender, 242);
        sparseIntArray.put(js6.holder_welcome_image, 243);
        sparseIntArray.put(js6.holder_welcome_name, 244);
        sparseIntArray.put(js6.holder_whats_new, 245);
        sparseIntArray.put(js6.home_banner, 246);
        sparseIntArray.put(js6.home_more_title_view, 247);
        sparseIntArray.put(js6.home_video_digested_row, 248);
        sparseIntArray.put(js6.home_video_row, 249);
        sparseIntArray.put(js6.ibex_controller, 250);
        sparseIntArray.put(js6.ibex_fragment, 251);
        sparseIntArray.put(js6.in_app_update_dialog, 252);
        sparseIntArray.put(js6.inapp_update_appbar, 253);
        sparseIntArray.put(js6.inbox_header_holder, 254);
        sparseIntArray.put(js6.inbox_row, 255);
        sparseIntArray.put(js6.include_all_reviews, 256);
        sparseIntArray.put(js6.include_more_description, 257);
        sparseIntArray.put(js6.install_snackbar, 258);
        sparseIntArray.put(js6.kids_mode_deactive_dialog, 259);
        sparseIntArray.put(js6.launch, 260);
        sparseIntArray.put(js6.layout_date_picker, 261);
        sparseIntArray.put(js6.layout_step, 262);
        sparseIntArray.put(js6.level_detail, 263);
        sparseIntArray.put(js6.level_info, 264);
        sparseIntArray.put(js6.list_application_card, 265);
        sparseIntArray.put(js6.local_message_box, 266);
        sparseIntArray.put(js6.main_app_empty_view, 267);
        sparseIntArray.put(js6.message_box, 268);
        sparseIntArray.put(js6.mini_player_view, 269);
        sparseIntArray.put(js6.miui_dialog_fragment, 270);
        sparseIntArray.put(js6.more_title_view, 271);
        sparseIntArray.put(js6.movie_card, 272);
        sparseIntArray.put(js6.movie_cast, 273);
        sparseIntArray.put(js6.movie_description, 274);
        sparseIntArray.put(js6.movie_detail_collapse_view, 275);
        sparseIntArray.put(js6.movie_detail_header_view, 276);
        sparseIntArray.put(js6.movie_detail_tab_view, 277);
        sparseIntArray.put(js6.movie_detail_toolbar_view, 278);
        sparseIntArray.put(js6.movie_review_empty_viewholder, 279);
        sparseIntArray.put(js6.movie_review_info, 280);
        sparseIntArray.put(js6.movie_review_title, 281);
        sparseIntArray.put(js6.movie_search_card, 282);
        sparseIntArray.put(js6.movie_search_card_exact_match, 283);
        sparseIntArray.put(js6.movie_season_fixed_title, 284);
        sparseIntArray.put(js6.movie_season_title, 285);
        sparseIntArray.put(js6.movie_submit_review_item, 286);
        sparseIntArray.put(js6.movie_tag_view, 287);
        sparseIntArray.put(js6.movie_text_tag_view, 288);
        sparseIntArray.put(js6.multi_app_card, 289);
        sparseIntArray.put(js6.multi_app_card_digested, 290);
        sparseIntArray.put(js6.multiselect_content_fragment, 291);
        sparseIntArray.put(js6.multiselect_title_view, 292);
        sparseIntArray.put(js6.my_account_header, 293);
        sparseIntArray.put(js6.my_account_item, 294);
        sparseIntArray.put(js6.my_market_about, 295);
        sparseIntArray.put(js6.my_market_animation_row, 296);
        sparseIntArray.put(js6.my_market_balloon_row, 297);
        sparseIntArray.put(js6.my_market_header, 298);
        sparseIntArray.put(js6.my_market_row, 299);
        sparseIntArray.put(js6.my_market_view, 300);
        sparseIntArray.put(js6.my_reviews_list, 301);
        sparseIntArray.put(js6.myket_navigation_menu, 302);
        sparseIntArray.put(js6.myket_recent_download_view, 303);
        sparseIntArray.put(js6.myket_social_module, 304);
        sparseIntArray.put(js6.myket_star, 305);
        sparseIntArray.put(js6.myket_update_dialog, 306);
        sparseIntArray.put(js6.myket_video_view, 307);
        sparseIntArray.put(js6.mymarket_horizontal_item, 308);
        sparseIntArray.put(js6.nav_content, 309);
        sparseIntArray.put(js6.nearby_permission_alert_dialog, 310);
        sparseIntArray.put(js6.need_permission_to_continue, 311);
        sparseIntArray.put(js6.new_ver_note, 312);
        sparseIntArray.put(js6.not_suitable_for_kids, 313);
        sparseIntArray.put(js6.notification_badge, 314);
        sparseIntArray.put(js6.own_profile_toolbar_view, 315);
        sparseIntArray.put(js6.paging_footer_row_horizontal, 316);
        sparseIntArray.put(js6.payment, 317);
        sparseIntArray.put(js6.payment_dialog, 318);
        sparseIntArray.put(js6.payment_gateway_dialog, 319);
        sparseIntArray.put(js6.payment_gateway_view, 320);
        sparseIntArray.put(js6.permissions_item, 321);
        sparseIntArray.put(js6.pika_confirm_connect_dialog, 322);
        sparseIntArray.put(js6.pika_connect_fragment, 323);
        sparseIntArray.put(js6.pika_end_point_holder, 324);
        sparseIntArray.put(js6.pika_search, 325);
        sparseIntArray.put(js6.pika_select_device_bottom_dialog, 326);
        sparseIntArray.put(js6.pika_select_device_title_holder, 327);
        sparseIntArray.put(js6.popup_window, 328);
        sparseIntArray.put(js6.popup_window_item, 329);
        sparseIntArray.put(js6.profile_relation_view, 330);
        sparseIntArray.put(js6.purchase_transaction_item, 331);
        sparseIntArray.put(js6.radiobutton_multiple_choice, 332);
        sparseIntArray.put(js6.rate_review, 333);
        sparseIntArray.put(js6.rate_without_comment, 334);
        sparseIntArray.put(js6.receive_update_require_dialog, 335);
        sparseIntArray.put(js6.received_app_holder, 336);
        sparseIntArray.put(js6.recent_download_bottom_dialog, 337);
        sparseIntArray.put(js6.recent_download_holder, 338);
        sparseIntArray.put(js6.recycler_list, 339);
        sparseIntArray.put(js6.recycler_list_no_refresh, 340);
        sparseIntArray.put(js6.recycler_list_no_refresh_no_try, 341);
        sparseIntArray.put(js6.recycler_list_no_try, 342);
        sparseIntArray.put(js6.reel_ad_item, 343);
        sparseIntArray.put(js6.reel_card, 344);
        sparseIntArray.put(js6.reel_item, 345);
        sparseIntArray.put(js6.reels_custom_controller, 346);
        sparseIntArray.put(js6.reels_home_item_rectangle, 347);
        sparseIntArray.put(js6.reels_home_item_square, 348);
        sparseIntArray.put(js6.reels_shimmer_layout, 349);
        sparseIntArray.put(js6.report_dialog, 350);
        sparseIntArray.put(js6.restricted_app, 351);
        sparseIntArray.put(js6.restricted_app_detail, 352);
        sparseIntArray.put(js6.restriction_dialog, 353);
        sparseIntArray.put(js6.review_empty_data, 354);
        sparseIntArray.put(js6.review_item, 355);
        sparseIntArray.put(js6.reviews_more_title_view, 356);
        sparseIntArray.put(js6.schedule_download_type_dialog, 357);
        sparseIntArray.put(js6.schedule_time_dialog, 358);
        sparseIntArray.put(js6.screen_shot_item, 359);
        sparseIntArray.put(js6.search_ads_app, 360);
        sparseIntArray.put(js6.search_app_desc_card, 361);
        sparseIntArray.put(js6.search_collapse_view, 362);
        sparseIntArray.put(js6.search_history_list_title, 363);
        sparseIntArray.put(js6.search_list_title, 364);
        sparseIntArray.put(js6.search_normal_app, 365);
        sparseIntArray.put(js6.search_screenshot_app, 366);
        sparseIntArray.put(js6.search_scrollable_screenshot_app, 367);
        sparseIntArray.put(js6.search_snackbar, 368);
        sparseIntArray.put(js6.select_quality_dialog, 369);
        sparseIntArray.put(js6.send_feedback_button_item, 370);
        sparseIntArray.put(js6.send_reply_bottom_dialog_fragment, 371);
        sparseIntArray.put(js6.setting_app_version, 372);
        sparseIntArray.put(js6.setting_item_kids, 373);
        sparseIntArray.put(js6.setting_night_mode_item, 374);
        sparseIntArray.put(js6.setting_simple_item, 375);
        sparseIntArray.put(js6.setting_theme_style, 376);
        sparseIntArray.put(js6.share_app_home_layout, 377);
        sparseIntArray.put(js6.simple_action_bar, 378);
        sparseIntArray.put(js6.single_action_toolbar_view, 379);
        sparseIntArray.put(js6.single_select_dialog, 380);
        sparseIntArray.put(js6.special_main_card, 381);
        sparseIntArray.put(js6.splash_screen_fragment, 382);
        sparseIntArray.put(js6.storage_usage_fixed_header, 383);
        sparseIntArray.put(js6.streamer_avatar_item_view, 384);
        sparseIntArray.put(js6.streamer_header_item_view, 385);
        sparseIntArray.put(js6.streamer_name_item_view, 386);
        sparseIntArray.put(js6.streamer_profile_collapse_view, 387);
        sparseIntArray.put(js6.streamer_profile_toolbar_view, 388);
        sparseIntArray.put(js6.sub_review_item, 389);
        sparseIntArray.put(js6.tag_view, 390);
        sparseIntArray.put(js6.template_radio_button, 391);
        sparseIntArray.put(js6.theme_style_fragment, 392);
        sparseIntArray.put(js6.theme_style_toolbar_view, 393);
        sparseIntArray.put(js6.theme_toggle, 394);
        sparseIntArray.put(js6.toast, 395);
        sparseIntArray.put(js6.toolbar_nearby_connection, 396);
        sparseIntArray.put(js6.toolbar_recent_download, 397);
        sparseIntArray.put(js6.tracking_app_payment_content, 398);
        sparseIntArray.put(js6.trailer_finished_playing_view, 399);
        sparseIntArray.put(js6.update_card, ErrorDTO.CODE_ACCESS_DENIED);
        sparseIntArray.put(js6.update_card_myket, ErrorDTO.CODE_SERVER_SING_OUT);
        sparseIntArray.put(js6.update_empty_list_extension_view, 402);
        sparseIntArray.put(js6.update_header, 403);
        sparseIntArray.put(js6.update_rate, 404);
        sparseIntArray.put(js6.update_toolbar_view, 405);
        sparseIntArray.put(js6.user_header_info_item_view, 406);
        sparseIntArray.put(js6.user_horizontal_card, 407);
        sparseIntArray.put(js6.user_info_tag_view, 408);
        sparseIntArray.put(js6.user_vertical_card, 409);
        sparseIntArray.put(js6.vertical_line_view, 410);
        sparseIntArray.put(js6.video_view_controller, 411);
        sparseIntArray.put(js6.view_custom_list_search, 412);
        sparseIntArray.put(js6.view_login_info, 413);
        sparseIntArray.put(js6.view_menu_more, 414);
        sparseIntArray.put(js6.view_movie_download_button, 415);
        sparseIntArray.put(js6.view_payment_price, 416);
        sparseIntArray.put(js6.view_profile_tabs, 417);
        sparseIntArray.put(js6.view_progress_button, 418);
        sparseIntArray.put(js6.view_series_background, 419);
        sparseIntArray.put(js6.virtual_keyboard_item, 420);
        sparseIntArray.put(js6.virtual_keyboard_layout, 421);
        sparseIntArray.put(js6.virtual_keyboard_remove, 422);
        sparseIntArray.put(js6.vpn_service_snackbar, 423);
    }

    public static a79 e(int i, View view, Object obj) {
        ea1 ea1Var = null;
        int i2 = 0;
        switch (i) {
            case 1:
                if (!"layout/account_change_info_bottom_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for account_change_info_bottom is invalid. Received: "));
                }
                Object[] objArrI0 = a79.i0(view, 8, null, i4.F);
                i4 i4Var = new i4(null, view, (DialogButtonComponent) objArrI0[7], (View) objArrI0[1], (MyketEditText) objArrI0[3], (MyketInputLayout) objArrI0[6], (LinearLayout) objArrI0[0], (DialogHeaderComponent) objArrI0[5], (MyketTextView) objArrI0[4], (MyketTextView) objArrI0[2]);
                i4Var.E = -1L;
                i4Var.w.setTag(null);
                i4Var.x.setTag(null);
                i4Var.z.setTag(null);
                i4Var.B.setTag(null);
                i4Var.C.setTag(null);
                i4Var.l0(view);
                i4Var.g0();
                return i4Var;
            case 2:
                if (!"layout/account_link_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for account_link_item is invalid. Received: "));
                }
                Object[] objArrI02 = a79.i0(view, 4, null, t4.A);
                t4 t4Var = new t4(null, view, (SmallBoldTextButton) objArrI02[3], (FrameLayout) objArrI02[0], (MyketTextView) objArrI02[2], (MyketTextView) objArrI02[1]);
                t4Var.z = -1L;
                t4Var.w.setTag(null);
                t4Var.x.setTag(null);
                t4Var.y.setTag(null);
                t4Var.l0(view);
                t4Var.g0();
                return t4Var;
            case 3:
                if (!"layout/account_nick_name_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for account_nick_name is invalid. Received: "));
                }
                Object[] objArrI03 = a79.i0(view, 9, null, e5.E);
                e5 e5Var = new e5(null, view, (MyketTextView) objArrI03[6], (DialogButtonComponent) objArrI03[8], (View) objArrI03[1], (MyketTextView) objArrI03[3], (MyketInputLayout) objArrI03[7], (MyketEditText) objArrI03[2], (DialogHeaderComponent) objArrI03[5]);
                e5Var.D = -1L;
                e5Var.x.setTag(null);
                e5Var.y.setTag(null);
                e5Var.A.setTag(null);
                ((ConstraintLayout) objArrI03[0]).setTag(null);
                e5Var.l0(view);
                e5Var.g0();
                return e5Var;
            case 4:
                if (!"layout/account_private_mode_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for account_private_mode_item is invalid. Received: "));
                }
                Object[] objArrI04 = a79.i0(view, 5, null, h5.B);
                h5 h5Var = new h5(null, view, (MyketSwitch) objArrI04[1], (LoadingView) objArrI04[4], (FrameLayout) objArrI04[0], (MyketTextView) objArrI04[3], (MyketTextView) objArrI04[2]);
                h5Var.A = -1L;
                h5Var.v.setTag(null);
                h5Var.x.setTag(null);
                h5Var.y.setTag(null);
                h5Var.z.setTag(null);
                h5Var.l0(view);
                h5Var.g0();
                return h5Var;
            case 5:
                if (!"layout/account_username_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for account_username is invalid. Received: "));
                }
                Object[] objArrI05 = a79.i0(view, 10, null, k5.F);
                DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI05[9];
                MyketTextView myketTextView = (MyketTextView) objArrI05[4];
                MyketTextView myketTextView2 = (MyketTextView) objArrI05[7];
                MyketTextView myketTextView3 = (MyketTextView) objArrI05[8];
                ConstraintLayout constraintLayout = (ConstraintLayout) objArrI05[5];
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI05[0];
                MyketTextView myketTextView4 = (MyketTextView) objArrI05[6];
                k5 k5Var = new k5(null, view, dialogButtonComponent, myketTextView, myketTextView2, myketTextView3, constraintLayout, constraintLayout2, myketTextView4, (MyketEditText) objArrI05[1]);
                k5Var.E = -1L;
                k5Var.A.setTag(null);
                k5Var.C.setTag(null);
                k5Var.l0(view);
                k5Var.g0();
                return k5Var;
            case 6:
                if (!"layout/achievement_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for achievement_item is invalid. Received: "));
                }
                Object[] objArrI06 = a79.i0(view, 5, null, n5.A);
                n5 n5Var = new n5(null, view, (ImageView) objArrI06[4], (MyketTextView) objArrI06[2], (MyketTextView) objArrI06[1], (MyketTextView) objArrI06[3]);
                n5Var.z = -1L;
                ((ConstraintLayout) objArrI06[0]).setTag(null);
                n5Var.w.setTag(null);
                n5Var.x.setTag(null);
                n5Var.y.setTag(null);
                n5Var.l0(view);
                n5Var.g0();
                return n5Var;
            case 7:
                if (!"layout/achivement_title_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for achivement_title is invalid. Received: "));
                }
                Object[] objArrI07 = a79.i0(view, 2, null, null);
                p5 p5Var = new p5(null, view, (FrameLayout) objArrI07[0], (MyketTextView) objArrI07[1]);
                p5Var.x = -1L;
                p5Var.v.setTag(null);
                p5Var.w.setTag(null);
                p5Var.l0(view);
                p5Var.g0();
                return p5Var;
            case 8:
                if (!"layout/activity_comment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for activity_comment is invalid. Received: "));
                }
                Object[] objArrI08 = a79.i0(view, 6, null, a7.z);
                FrameLayout frameLayout = (FrameLayout) objArrI08[1];
                ProtectionLayout protectionLayout = (ProtectionLayout) objArrI08[0];
                View view2 = (View) objArrI08[5];
                a7 a7Var = new a7(null, view, frameLayout, protectionLayout, view2);
                a7Var.y = -1L;
                ((FrameLayout) a7Var.v).setTag(null);
                ((ProtectionLayout) a7Var.w).setTag(null);
                a7Var.l0(view);
                a7Var.g0();
                return a7Var;
            case 9:
                if (!"layout/activity_intro_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for activity_intro is invalid. Received: "));
                }
                Object[] objArrI09 = a79.i0(view, 2, null, j7.w);
                j7 j7Var = new j7(0, view, null);
                j7Var.v = -1L;
                ((FrameLayout) objArrI09[0]).setTag(null);
                j7Var.l0(view);
                j7Var.g0();
                return j7Var;
            case 10:
                if (!"layout/activity_reels_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for activity_reels is invalid. Received: "));
                }
                Object[] objArrI010 = a79.i0(view, 2, null, q7.x);
                q7 q7Var = new q7(null, view, (FrameLayout) objArrI010[0]);
                q7Var.w = -1L;
                ((FrameLayout) q7Var.v).setTag(null);
                q7Var.l0(view);
                q7Var.g0();
                return q7Var;
            case 11:
                if (!"layout/addax_box_one_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for addax_box_one is invalid. Received: "));
                }
                Object[] objArrI011 = a79.i0(view, 7, null, lc.C);
                lc lcVar = new lc(null, view, (SmallFillOvalButton) objArrI011[5], (View) objArrI011[6], (ConstraintLayout) objArrI011[1], (ImageView) objArrI011[2], (MyketTextView) objArrI011[4], (MyketTextView) objArrI011[3]);
                lcVar.B = -1L;
                ((RelativeLayout) objArrI011[0]).setTag(null);
                lcVar.l0(view);
                lcVar.g0();
                return lcVar;
            case 12:
                if (!"layout/addax_box_three_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for addax_box_three is invalid. Received: "));
                }
                Object[] objArrI012 = a79.i0(view, 6, null, nc.B);
                nc ncVar = new nc(null, view, (BigTextButton) objArrI012[4], (View) objArrI012[5], (ConstraintLayout) objArrI012[1], (ImageView) objArrI012[3], (MyketTextView) objArrI012[2]);
                ncVar.A = -1L;
                ((RelativeLayout) objArrI012[0]).setTag(null);
                ncVar.l0(view);
                ncVar.g0();
                return ncVar;
            case 13:
                if (!"layout/addax_box_two_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for addax_box_two is invalid. Received: "));
                }
                Object[] objArrI013 = a79.i0(view, 7, null, pc.C);
                pc pcVar = new pc(null, view, (SmallFillOvalButton) objArrI013[5], (View) objArrI013[6], (ConstraintLayout) objArrI013[1], (ImageView) objArrI013[4], (MyketTextView) objArrI013[3], (MyketTextView) objArrI013[2]);
                pcVar.B = -1L;
                ((RelativeLayout) objArrI013[0]).setTag(null);
                pcVar.l0(view);
                pcVar.g0();
                return pcVar;
            case 14:
                if (!"layout/ai_review_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for ai_review is invalid. Received: "));
                }
                Object[] objArrI014 = a79.i0(view, 11, null, yc.F);
                MyketTextView myketTextView5 = (MyketTextView) objArrI014[3];
                MyketImageButton myketImageButton = (MyketImageButton) objArrI014[9];
                View view3 = (View) objArrI014[6];
                yc ycVar = new yc(null, view, myketTextView5, myketImageButton, view3, (ConstraintLayout) objArrI014[5], (MyketImageButton) objArrI014[8], (Group) objArrI014[10], (MyketTextView) objArrI014[2], (MyketTextView) objArrI014[1], (MyketTextView) objArrI014[4]);
                ycVar.E = -1L;
                ycVar.v.setTag(null);
                ((FrameLayout) objArrI014[0]).setTag(null);
                ycVar.B.setTag(null);
                ycVar.C.setTag(null);
                ycVar.D.setTag(null);
                ycVar.l0(view);
                ycVar.g0();
                return ycVar;
            case 15:
                if (!"layout/alert_dialog_bottom_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for alert_dialog_bottom is invalid. Received: "));
                }
                Object[] objArrI015 = a79.i0(view, 6, null, nd.y);
                View view4 = (View) objArrI015[2];
                LinearLayout linearLayout = (LinearLayout) objArrI015[0];
                nd ndVar = new nd(null, view, view4, linearLayout);
                ndVar.x = -1L;
                ((LinearLayout) ndVar.w).setTag(null);
                ndVar.l0(view);
                ndVar.g0();
                return ndVar;
            case 16:
                if (!"layout/app_card_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_card is invalid. Received: "));
                }
                Object[] objArrI016 = a79.i0(view, 6, null, om.B);
                om omVar = new om(null, view, (FrameLayout) objArrI016[1], (View) objArrI016[2], (FastDownloadView) objArrI016[5], (AppIconView) objArrI016[3], (MyketTextView) objArrI016[4]);
                omVar.A = -1L;
                omVar.v.setTag(null);
                ((ConstraintLayout) objArrI016[0]).setTag(null);
                omVar.l0(view);
                omVar.g0();
                return omVar;
            case 17:
                if (!"layout/app_card_digested_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_card_digested is invalid. Received: "));
                }
                Object[] objArrI017 = a79.i0(view, 5, null, qm.A);
                qm qmVar = new qm(null, view, (FrameLayout) objArrI017[1], (View) objArrI017[2], (AppIconView) objArrI017[3], (MyketTextView) objArrI017[4]);
                qmVar.z = -1L;
                qmVar.v.setTag(null);
                ((ConstraintLayout) objArrI017[0]).setTag(null);
                qmVar.l0(view);
                qmVar.g0();
                return qmVar;
            case 18:
                if ("layout-w1280dp-land/app_detail_suggestion_place_0".equals(obj)) {
                    Object[] objArrI018 = a79.i0(view, 2, null, sp.x);
                    sp spVar = new sp(0, view, null);
                    spVar.w = -1L;
                    ((ConstraintLayout) objArrI018[0]).setTag(null);
                    spVar.l0(view);
                    spVar.g0();
                    return spVar;
                }
                if (!"layout/app_detail_suggestion_place_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_detail_suggestion_place is invalid. Received: "));
                }
                Object[] objArrI019 = a79.i0(view, 1, null, null);
                rp rpVar = new rp(0, view, null);
                rpVar.w = -1L;
                ((ConstraintLayout) objArrI019[0]).setTag(null);
                rpVar.l0(view);
                rpVar.g0();
                return rpVar;
            case 19:
                if (!"layout/app_download_active_holder_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_download_active_holder is invalid. Received: "));
                }
                Object[] objArrI020 = a79.i0(view, 5, null, dq.B);
                dq dqVar = new dq(null, view, (AppIconView) objArrI020[2], (MyketTextView) objArrI020[1], (ConstraintLayout) objArrI020[0], (MyketTextView) objArrI020[3], (FastDownloadView) objArrI020[4]);
                dqVar.A = -1L;
                dqVar.w.setTag(null);
                dqVar.x.setTag(null);
                dqVar.l0(view);
                dqVar.g0();
                return dqVar;
            case 20:
                if (!"layout/app_info_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_info_view is invalid. Received: "));
                }
                Object[] objArrI021 = a79.i0(view, 6, null, nq.D);
                nq nqVar = new nq(null, view, (MyketTextView) objArrI021[3], (View) objArrI021[2], (ImageView) objArrI021[5], (LinearLayout) objArrI021[0], (ImageView) objArrI021[4], (MyketTextView) objArrI021[1]);
                nqVar.C = -1L;
                nqVar.v.setTag(null);
                nqVar.w.setTag(null);
                nqVar.y.setTag(null);
                nqVar.A.setTag(null);
                nqVar.l0(view);
                nqVar.g0();
                return nqVar;
            case 21:
                if (!"layout/app_not_found_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_not_found is invalid. Received: "));
                }
                Object[] objArrI022 = a79.i0(view, 5, null, or.z);
                FrameLayout frameLayout2 = (FrameLayout) objArrI022[0];
                MyketTextView myketTextView6 = (MyketTextView) objArrI022[2];
                or orVar = new or(null, view, frameLayout2, myketTextView6, (MyketTextView) objArrI022[1]);
                orVar.y = -1L;
                orVar.x.setTag(null);
                orVar.v.setTag(null);
                orVar.w.setTag(null);
                orVar.l0(view);
                orVar.g0();
                return orVar;
            case 22:
                if (!"layout/app_summery_icon_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_summery_icon is invalid. Received: "));
                }
                Object[] objArrI023 = a79.i0(view, 5, null, pt.A);
                pt ptVar = new pt(null, view, (ImageView) objArrI023[4], (ConstraintLayout) objArrI023[1], (MyketTextView) objArrI023[3], (MyketTextView) objArrI023[2]);
                ptVar.z = -1L;
                ptVar.v.setTag(null);
                ((FrameLayout) objArrI023[0]).setTag(null);
                ptVar.x.setTag(null);
                ptVar.y.setTag(null);
                ptVar.l0(view);
                ptVar.g0();
                return ptVar;
            case 23:
                if (!"layout/app_summery_rate_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_summery_rate is invalid. Received: "));
                }
                Object[] objArrI024 = a79.i0(view, 5, null, rt.A);
                rt rtVar = new rt(null, view, (ImageView) objArrI024[4], (ConstraintLayout) objArrI024[1], (MyketTextView) objArrI024[3], (MyketTextView) objArrI024[2]);
                rtVar.z = -1L;
                rtVar.v.setTag(null);
                ((FrameLayout) objArrI024[0]).setTag(null);
                rtVar.x.setTag(null);
                rtVar.y.setTag(null);
                rtVar.l0(view);
                rtVar.g0();
                return rtVar;
            case 24:
                if (!"layout/app_summery_size_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_summery_size is invalid. Received: "));
                }
                Object[] objArrI025 = a79.i0(view, 4, null, null);
                st stVar = new st(null, view, (ConstraintLayout) objArrI025[1], (MyketTextView) objArrI025[3], (MyketTextView) objArrI025[2]);
                stVar.y = -1L;
                stVar.v.setTag(null);
                ((FrameLayout) objArrI025[0]).setTag(null);
                stVar.w.setTag(null);
                stVar.x.setTag(null);
                stVar.l0(view);
                stVar.g0();
                return stVar;
            case 25:
                if (!"layout/app_summery_text_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for app_summery_text is invalid. Received: "));
                }
                Object[] objArrI026 = a79.i0(view, 4, null, null);
                tt ttVar = new tt(null, view, (ConstraintLayout) objArrI026[1], (MyketTextView) objArrI026[3], (MyketTextView) objArrI026[2]);
                ttVar.y = -1L;
                ttVar.v.setTag(null);
                ((FrameLayout) objArrI026[0]).setTag(null);
                ttVar.w.setTag(null);
                ttVar.x.setTag(null);
                ttVar.l0(view);
                ttVar.g0();
                return ttVar;
            case 26:
                if ("layout/app_summery_view_0".equals(obj)) {
                    return new ut(new View[]{view});
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for app_summery_view is invalid. Received: "));
            case 27:
                if (!"layout/arrow_dialog_component_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for arrow_dialog_component is invalid. Received: "));
                }
                Object[] objArrI027 = a79.i0(view, 2, null, gw.z);
                gw gwVar = new gw(null, view, (View) objArrI027[1], (ConstraintLayout) objArrI027[0]);
                gwVar.y = -1L;
                gwVar.w.setTag(null);
                gwVar.l0(view);
                gwVar.g0();
                return gwVar;
            case 28:
                if (!"layout/badge_text_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for badge_text is invalid. Received: "));
                }
                f50 f50Var = new f50(ea1Var, view, (MyketTextView) a79.i0(view, 1, null, null)[0], i2);
                f50Var.x = -1L;
                f50Var.w.setTag(null);
                f50Var.l0(view);
                f50Var.g0();
                return f50Var;
            case 29:
                if (!"layout/base_content_layout_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for base_content_layout is invalid. Received: "));
                }
                Object[] objArrI028 = a79.i0(view, 4, null, o60.z);
                FrameLayout frameLayout3 = (FrameLayout) objArrI028[3];
                LinearLayout linearLayout2 = (LinearLayout) objArrI028[1];
                ProtectionLayout protectionLayout2 = (ProtectionLayout) objArrI028[0];
                o60 o60Var = new o60(null, view, frameLayout3, linearLayout2, protectionLayout2);
                o60Var.y = -1L;
                o60Var.w.setTag(null);
                o60Var.x.setTag(null);
                o60Var.l0(view);
                o60Var.g0();
                return o60Var;
            case 30:
                if (!"layout/base_draggable_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for base_draggable_fragment is invalid. Received: "));
                }
                Object[] objArrI029 = a79.i0(view, 6, null, v60.C);
                ImageView imageView = (ImageView) objArrI029[5];
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArrI029[0];
                ElasticFrameLayout elasticFrameLayout = (ElasticFrameLayout) objArrI029[2];
                v60 v60Var = new v60(null, view, imageView, coordinatorLayout, elasticFrameLayout, (NestedScrollView) objArrI029[3], (MyketTextView) objArrI029[1]);
                v60Var.B = -1L;
                v60Var.w.setTag(null);
                v60Var.z.setTag(null);
                v60Var.l0(view);
                v60Var.g0();
                return v60Var;
            case 31:
                if ("layout/base_video_fragment_0".equals(obj)) {
                    return new x90(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for base_video_fragment is invalid. Received: "));
            case 32:
                if (!"layout/birthday_animation_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for birthday_animation_view is invalid. Received: "));
                }
                Object[] objArrI030 = a79.i0(view, 2, null, wb0.y);
                wb0 wb0Var = new wb0(null, view, (LottieAnimationView) objArrI030[1]);
                wb0Var.x = -1L;
                ((ConstraintLayout) objArrI030[0]).setTag(null);
                wb0Var.l0(view);
                wb0Var.g0();
                return wb0Var;
            case 33:
                if (!"layout/birthday_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for birthday_dialog is invalid. Received: "));
                }
                Object[] objArrI031 = a79.i0(view, 7, null, ac0.C);
                ac0 ac0Var = new ac0(null, view, (BirthdayPicker) objArrI031[5], (DialogButtonComponent) objArrI031[6], (View) objArrI031[1], (MyketTextView) objArrI031[2], (DialogHeaderComponent) objArrI031[4]);
                ac0Var.B = -1L;
                ac0Var.x.setTag(null);
                ac0Var.y.setTag(null);
                ((ConstraintLayout) objArrI031[0]).setTag(null);
                ac0Var.l0(view);
                ac0Var.g0();
                return ac0Var;
            case 34:
                if (!"layout/bookmarks_list_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for bookmarks_list is invalid. Received: "));
                }
                Object[] objArrI032 = a79.i0(view, 4, null, wd0.A);
                wd0 wd0Var = new wd0(null, view, (TabLayout) objArrI032[1], (ViewPager2) objArrI032[2], (View) objArrI032[3]);
                wd0Var.z = -1L;
                ((RelativeLayout) objArrI032[0]).setTag(null);
                wd0Var.l0(view);
                wd0Var.g0();
                return wd0Var;
            case 35:
                if ("layout/buttons_dialog_0".equals(obj)) {
                    Object[] objArrI033 = a79.i0(view, 2, null, null);
                    ji0 ji0Var = new ji0(null, view, (BigTextButton) objArrI033[1], 1);
                    ji0Var.y = -1L;
                    ji0Var.v.setTag(null);
                    ((ConstraintLayout) objArrI033[0]).setTag(null);
                    ji0Var.l0(view);
                    ji0Var.g0();
                    return ji0Var;
                }
                if (!"layout-fa/buttons_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for buttons_dialog is invalid. Received: "));
                }
                Object[] objArrI034 = a79.i0(view, 2, null, null);
                ji0 ji0Var2 = new ji0(null, view, (BigTextButton) objArrI034[1], 0);
                ji0Var2.y = -1L;
                ji0Var2.v.setTag(null);
                ((ConstraintLayout) objArrI034[0]).setTag(null);
                ji0Var2.l0(view);
                ji0Var2.g0();
                return ji0Var2;
            case 36:
                if ("layout/buttons_dialog_component_0".equals(obj)) {
                    return new ki0(1, new View[]{view});
                }
                if ("layout-fa/buttons_dialog_component_0".equals(obj)) {
                    return new ki0(0, new View[]{view});
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for buttons_dialog_component is invalid. Received: "));
            case 37:
                if (!"layout/buttons_dialog_component_vertical_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for buttons_dialog_component_vertical is invalid. Received: "));
                }
                Object[] objArrI035 = a79.i0(view, 3, null, mi0.A);
                mi0 mi0Var = new mi0(null, view, (MyketTextView) objArrI035[1], (BigFillOvalButton) objArrI035[2], (LinearLayoutCompat) objArrI035[0]);
                mi0Var.z = -1L;
                mi0Var.v.setTag(null);
                mi0Var.x.setTag(null);
                mi0Var.l0(view);
                mi0Var.g0();
                return mi0Var;
            case 38:
                if (!"layout/buzz_progress_image_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for buzz_progress_image_view is invalid. Received: "));
                }
                Object[] objArrI036 = a79.i0(view, 2, null, ri0.y);
                ri0 ri0Var = new ri0(null, view, (ImageView) objArrI036[1]);
                ri0Var.x = -1L;
                ((RelativeLayout) objArrI036[0]).setTag(null);
                ri0Var.l0(view);
                ri0Var.g0();
                return ri0Var;
            case 39:
                if ("layout/city_footer_0".equals(obj)) {
                    return new gs0(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for city_footer is invalid. Received: "));
            case 40:
                if ("layout/city_header_0".equals(obj)) {
                    return new is0(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for city_header is invalid. Received: "));
            case 41:
                if (!"layout/clear_all_dialogs_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for clear_all_dialogs is invalid. Received: "));
                }
                Object[] objArrI037 = a79.i0(view, 5, null, vs0.A);
                MyketTextView myketTextView7 = (MyketTextView) objArrI037[3];
                DialogButtonComponent dialogButtonComponent2 = (DialogButtonComponent) objArrI037[4];
                LinearLayout linearLayout3 = (LinearLayout) objArrI037[0];
                vs0 vs0Var = new vs0(null, view, myketTextView7, dialogButtonComponent2, linearLayout3);
                vs0Var.z = -1L;
                vs0Var.x.setTag(null);
                vs0Var.l0(view);
                vs0Var.g0();
                return vs0Var;
            case 42:
                if ("layout/comment_0".equals(obj)) {
                    return new hw0(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for comment is invalid. Received: "));
            case 43:
                if ("layout/comment_dialog_0".equals(obj)) {
                    return new jw0(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for comment_dialog is invalid. Received: "));
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                if (!"layout/confirm_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for confirm_dialog is invalid. Received: "));
                }
                Object[] objArrI038 = a79.i0(view, 3, null, f11.z);
                f11 f11Var = new f11(null, view, (DialogButtonComponent) objArrI038[2], (MyketTextView) objArrI038[1]);
                f11Var.y = -1L;
                ((LinearLayout) objArrI038[0]).setTag(null);
                f11Var.l0(view);
                f11Var.g0();
                return f11Var;
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                if (!"layout/content_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for content_fragment is invalid. Received: "));
                }
                w31 w31Var = new w31(null, view, (FrameLayout) a79.i0(view, 1, null, null)[0]);
                w31Var.x = -1L;
                w31Var.w.setTag(null);
                w31Var.l0(view);
                w31Var.g0();
                return w31Var;
            case 46:
                if (!"layout/content_web_view_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for content_web_view_fragment is invalid. Received: "));
                }
                Object[] objArrI039 = a79.i0(view, 3, null, w41.A);
                w41 w41Var = new w41(null, view, (RelativeLayout) objArrI039[0], (TryAgainView) objArrI039[2], (MyketWebView) objArrI039[1]);
                w41Var.z = -1L;
                w41Var.v.setTag(null);
                w41Var.l0(view);
                w41Var.g0();
                return w41Var;
            case 47:
                if (!"layout/detail_toolbar_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for detail_toolbar_view is invalid. Received: "));
                }
                Object[] objArrI040 = a79.i0(view, 10, null, nk1.H);
                nk1 nk1Var = new nk1(null, view, (AppIconView) objArrI040[9], (MyketNoPaddingTextView) objArrI040[3], (MyketTextView) objArrI040[1], (ImageView) objArrI040[4], (SmallFillOvalButton) objArrI040[6], (DownloadProgressBar) objArrI040[5], (ConstraintLayout) objArrI040[0], (MyketNoPaddingTextView) objArrI040[2], (SmallEmptyLargeTextOvalButton) objArrI040[7], (ImageView) objArrI040[8]);
                nk1Var.G = -1L;
                nk1Var.w.setTag(null);
                nk1Var.x.setTag(null);
                nk1Var.y.setTag(null);
                nk1Var.B.setTag(null);
                nk1Var.C.setTag(null);
                nk1Var.l0(view);
                nk1Var.g0();
                return nk1Var;
            case 48:
                if (!"layout/developer_info_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for developer_info_view is invalid. Received: "));
                }
                Object[] objArrI041 = a79.i0(view, 4, null, jl1.A);
                jl1 jl1Var = new jl1(null, view, (FrameLayout) objArrI041[0], (ImageView) objArrI041[3], (MyketTextView) objArrI041[1], (MyketTextView) objArrI041[2]);
                jl1Var.z = -1L;
                jl1Var.v.setTag(null);
                jl1Var.w.setTag(null);
                jl1Var.y.setTag(null);
                jl1Var.l0(view);
                jl1Var.g0();
                return jl1Var;
            case 49:
                if (!"layout/developer_page_title_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for developer_page_title_view is invalid. Received: "));
                }
                kl1 kl1Var = new kl1(null, view, (MyketTextView) a79.i0(view, 1, null, null)[0]);
                kl1Var.w = -1L;
                kl1Var.v.setTag(null);
                kl1Var.l0(view);
                kl1Var.g0();
                return kl1Var;
            case 50:
                if ("layout/developer_title_view_0".equals(obj)) {
                    return new rl1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for developer_title_view is invalid. Received: "));
            default:
                return null;
        }
    }

    public static a79 f(int i, View view, Object obj) {
        switch (i) {
            case 51:
                if ("layout/dialog_alert_app_install_failed_0".equals(obj)) {
                    return new cm1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_alert_app_install_failed is invalid. Received: "));
            case 52:
                if ("layout/dialog_app_failed_storage_install_0".equals(obj)) {
                    return new em1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_app_failed_storage_install is invalid. Received: "));
            case 53:
                if ("layout/dialog_app_install_0".equals(obj)) {
                    return new gm1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_app_install is invalid. Received: "));
            case 54:
                if ("layout-fa/dialog_app_progress_0".equals(obj)) {
                    Object[] objArrI0 = a79.i0(view, 5, null, im1.C);
                    im1 im1Var = new im1(null, view, (DialogButtonLayout) objArrI0[4], (DialogHeaderComponent) objArrI0[2], (MyketTextView) objArrI0[1], (LinearLayout) objArrI0[0], (LinearProgressIndicator) objArrI0[3]);
                    im1Var.B = -1L;
                    im1Var.x.setTag(null);
                    im1Var.y.setTag(null);
                    im1Var.l0(view);
                    im1Var.g0();
                    return im1Var;
                }
                if (!"layout/dialog_app_progress_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_app_progress is invalid. Received: "));
                }
                Object[] objArrI02 = a79.i0(view, 5, null, jm1.C);
                jm1 jm1Var = new jm1(null, view, (DialogButtonLayout) objArrI02[4], (DialogHeaderComponent) objArrI02[2], (MyketTextView) objArrI02[1], (LinearLayout) objArrI02[0], (LinearProgressIndicator) objArrI02[3]);
                jm1Var.B = -1L;
                jm1Var.x.setTag(null);
                jm1Var.y.setTag(null);
                jm1Var.l0(view);
                jm1Var.g0();
                return jm1Var;
            case 55:
                if ("layout/dialog_app_retry_install_0".equals(obj)) {
                    return new lm1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_app_retry_install is invalid. Received: "));
            case 56:
                if ("layout/dialog_app_sign_not_matched_0".equals(obj)) {
                    return new nm1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_app_sign_not_matched is invalid. Received: "));
            case 57:
                if ("layout/dialog_app_un_success_install_0".equals(obj)) {
                    return new pm1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_app_un_success_install is invalid. Received: "));
            case 58:
                if ("layout/dialog_credit_0".equals(obj)) {
                    return new vm1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_credit is invalid. Received: "));
            case 59:
                if ("layout/dialog_custom_list_title_0".equals(obj)) {
                    return new xm1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_custom_list_title is invalid. Received: "));
            case 60:
                if ("layout/dialog_in_app_notification_0".equals(obj)) {
                    return new kn1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_in_app_notification is invalid. Received: "));
            case 61:
                if ("layout-fa/dialog_login_0".equals(obj)) {
                    return new mn1(view);
                }
                if ("layout-fa-land/dialog_login_0".equals(obj)) {
                    return new nn1(view);
                }
                if ("layout-land/dialog_login_0".equals(obj)) {
                    return new pn1(view);
                }
                if ("layout/dialog_login_0".equals(obj)) {
                    return new on1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_login is invalid. Received: "));
            case 62:
                if ("layout-fa/dialog_payment_retry_0".equals(obj)) {
                    return new rn1(view);
                }
                if ("layout/dialog_payment_retry_0".equals(obj)) {
                    return new sn1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_payment_retry is invalid. Received: "));
            case 63:
                if ("layout/dialog_permission_document_file_0".equals(obj)) {
                    return new un1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_permission_document_file is invalid. Received: "));
            case 64:
                if ("layout/dialog_profile_add_list_0".equals(obj)) {
                    return new wn1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_profile_add_list is invalid. Received: "));
            case 65:
                if ("layout/dialog_progress_0".equals(obj)) {
                    return new yn1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for dialog_progress is invalid. Received: "));
            case 66:
                if ("layout/divider_0".equals(obj)) {
                    return new iq1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for divider is invalid. Received: "));
            case 67:
                if ("layout/download_content_fragment_0".equals(obj)) {
                    return new tr1(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for download_content_fragment is invalid. Received: "));
            case 68:
                if ("layout/empty_card_0".equals(obj)) {
                    return new w31(1, view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for empty_card is invalid. Received: "));
            case 69:
                if (!"layout/empty_city_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for empty_city_view is invalid. Received: "));
                }
                Object[] objArrI03 = a79.i0(view, 2, null, d12.y);
                d12 d12Var = new d12(null, view, (LinearLayout) objArrI03[0], (MyketTextView) objArrI03[1]);
                d12Var.x = -1L;
                d12Var.v.setTag(null);
                d12Var.l0(view);
                d12Var.g0();
                return d12Var;
            case 70:
                if ("layout/empty_view_button_0".equals(obj)) {
                    return new l12(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for empty_view_button is invalid. Received: "));
            case 71:
                if (!"layout/feedback_attach_content_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_attach_content_item is invalid. Received: "));
                }
                Object[] objArrI04 = a79.i0(view, 10, null, g92.F);
                g92 g92Var = new g92(null, view, (SmallFillBorderOvalButton) objArrI04[2], (ConstraintLayout) objArrI04[6], (ImageButton) objArrI04[5], (MyketTextView) objArrI04[1], (ImageButton) objArrI04[4], (ImageView) objArrI04[3], (CardView) objArrI04[7], (ConstraintLayout) objArrI04[8], (LoadingView) objArrI04[9]);
                g92Var.E = -1L;
                g92Var.v.setTag(null);
                g92Var.x.setTag(null);
                g92Var.y.setTag(null);
                ((ConstraintLayout) objArrI04[0]).setTag(null);
                g92Var.z.setTag(null);
                g92Var.A.setTag(null);
                g92Var.l0(view);
                g92Var.g0();
                return g92Var;
            case 72:
                if ("layout/feedback_body_edit_text_item_0".equals(obj)) {
                    return new h92(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_body_edit_text_item is invalid. Received: "));
            case 73:
                if (!"layout/feedback_choose_topoic_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_choose_topoic_item is invalid. Received: "));
                }
                Object[] objArrI05 = a79.i0(view, 3, null, k92.z);
                k92 k92Var = new k92(null, view, (ImageView) objArrI05[2], (ConstraintLayout) objArrI05[0], (MyketTextView) objArrI05[1]);
                k92Var.y = -1L;
                k92Var.x.setTag(null);
                k92Var.l0(view);
                k92Var.g0();
                return k92Var;
            case 74:
                if (!"layout/feedback_dialog_transition_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_dialog_transition is invalid. Received: "));
                }
                Object[] objArrI06 = a79.i0(view, 9, null, o92.E);
                AppIconView appIconView = (AppIconView) objArrI06[8];
                ImageButton imageButton = (ImageButton) objArrI06[5];
                MyketTextView myketTextView = (MyketTextView) objArrI06[3];
                ImageButton imageButton2 = (ImageButton) objArrI06[6];
                MyketTextView myketTextView2 = (MyketTextView) objArrI06[1];
                MyketTextView myketTextView3 = (MyketTextView) objArrI06[4];
                FrameLayout frameLayout = (FrameLayout) objArrI06[0];
                o92 o92Var = new o92(null, view, appIconView, imageButton, myketTextView, imageButton2, myketTextView2, myketTextView3, frameLayout, (MyketTextView) objArrI06[2]);
                o92Var.D = -1L;
                o92Var.w.setTag(null);
                o92Var.x.setTag(null);
                o92Var.y.setTag(null);
                o92Var.z.setTag(null);
                o92Var.A.setTag(null);
                o92Var.B.setTag(null);
                o92Var.C.setTag(null);
                o92Var.l0(view);
                o92Var.g0();
                return o92Var;
            case 75:
                if (!"layout/feedback_phone_number_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_phone_number_item is invalid. Received: "));
                }
                Object[] objArrI07 = a79.i0(view, 2, null, null);
                v92 v92Var = new v92(null, view, (MyketEditText) objArrI07[1]);
                v92Var.w = -1L;
                v92Var.v.setTag(null);
                ((ConstraintLayout) objArrI07[0]).setTag(null);
                v92Var.l0(view);
                v92Var.g0();
                return v92Var;
            case 76:
                if (!"layout/feedback_transaction_content_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_transaction_content_fragment is invalid. Received: "));
                }
                Object[] objArrI08 = a79.i0(view, 6, null, ea2.A);
                ImageView imageView = (ImageView) objArrI08[1];
                ea2 ea2Var = new ea2(null, view, imageView, (View) objArrI08[2], (DialogHeaderComponent) objArrI08[4]);
                ea2Var.z = -1L;
                ea2Var.v.setTag(null);
                ea2Var.w.setTag(null);
                ((ConstraintLayout) objArrI08[0]).setTag(null);
                ea2Var.l0(view);
                ea2Var.g0();
                return ea2Var;
            case 77:
                ea1 ea1Var = null;
                if (!"layout/feedback_transaction_header_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_transaction_header is invalid. Received: "));
                }
                f50 f50Var = new f50(ea1Var, view, (MyketTextView) a79.i0(view, 1, null, null)[0], 1);
                f50Var.x = -1L;
                f50Var.w.setTag(null);
                f50Var.l0(view);
                f50Var.g0();
                return f50Var;
            case 78:
                if (!"layout/feedback_transaction_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_transaction_item is invalid. Received: "));
                }
                Object[] objArrI09 = a79.i0(view, 9, null, ka2.F);
                ka2 ka2Var = new ka2(null, view, (AppIconView) objArrI09[6], (View) objArrI09[7], (ConstraintLayout) objArrI09[0], (MyketTextView) objArrI09[3], (MyketTextView) objArrI09[2], (MyketTextView) objArrI09[8], (MyketTextView) objArrI09[1], (MyketTextView) objArrI09[4], (MyketTextView) objArrI09[5]);
                ka2Var.E = -1L;
                ka2Var.x.setTag(null);
                ka2Var.y.setTag(null);
                ka2Var.z.setTag(null);
                ka2Var.B.setTag(null);
                ka2Var.C.setTag(null);
                ka2Var.D.setTag(null);
                ka2Var.l0(view);
                ka2Var.g0();
                return ka2Var;
            case 79:
                if (!"layout/feedback_transaction_view_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for feedback_transaction_view_item is invalid. Received: "));
                }
                Object[] objArrI010 = a79.i0(view, 3, null, na2.z);
                na2 na2Var = new na2(null, view, (ImageView) objArrI010[2], (ConstraintLayout) objArrI010[0], (MyketTextView) objArrI010[1]);
                na2Var.y = -1L;
                na2Var.v.setTag(null);
                na2Var.x.setTag(null);
                na2Var.l0(view);
                na2Var.g0();
                return na2Var;
            case 80:
                if ("layout/filter_view_0".equals(obj)) {
                    Object[] objArrI011 = a79.i0(view, 7, null, mc2.A);
                    FrameLayout frameLayout2 = (FrameLayout) objArrI011[6];
                    View view2 = (View) objArrI011[5];
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArrI011[0];
                    ImageView imageView2 = (ImageView) objArrI011[3];
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI011[1];
                    mc2 mc2Var = new mc2(null, view, frameLayout2, view2, constraintLayout, imageView2, constraintLayout2, (MyketTextView) objArrI011[2]);
                    mc2Var.z = -1L;
                    mc2Var.x.setTag(null);
                    mc2Var.y.setTag(null);
                    mc2Var.l0(view);
                    mc2Var.g0();
                    return mc2Var;
                }
                if (!"layout-fa/filter_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for filter_view is invalid. Received: "));
                }
                Object[] objArrI012 = a79.i0(view, 7, null, lc2.A);
                FrameLayout frameLayout3 = (FrameLayout) objArrI012[6];
                View view3 = (View) objArrI012[5];
                ConstraintLayout constraintLayout3 = (ConstraintLayout) objArrI012[0];
                ImageView imageView3 = (ImageView) objArrI012[3];
                ConstraintLayout constraintLayout4 = (ConstraintLayout) objArrI012[1];
                lc2 lc2Var = new lc2(null, view, frameLayout3, view3, constraintLayout3, imageView3, constraintLayout4, (MyketTextView) objArrI012[2]);
                lc2Var.z = -1L;
                lc2Var.x.setTag(null);
                lc2Var.y.setTag(null);
                lc2Var.l0(view);
                lc2Var.g0();
                return lc2Var;
            case 81:
                if (!"layout/font_style_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for font_style_dialog is invalid. Received: "));
                }
                Object[] objArrI013 = a79.i0(view, 7, null, vi2.B);
                DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI013[6];
                View view4 = (View) objArrI013[3];
                vi2 vi2Var = new vi2(null, view, dialogButtonComponent, view4, (RecyclerView) objArrI013[5], (DialogHeaderComponent) objArrI013[2]);
                vi2Var.A = -1L;
                ((ConstraintLayout) objArrI013[0]).setTag(null);
                vi2Var.l0(view);
                vi2Var.g0();
                return vi2Var;
            case 82:
                if (!"layout/footer_row_vertical_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for footer_row_vertical is invalid. Received: "));
                }
                Object[] objArrI014 = a79.i0(view, 5, null, jj2.A);
                MyketTextView myketTextView4 = (MyketTextView) objArrI014[2];
                LoadingIndicator loadingIndicator = (LoadingIndicator) objArrI014[1];
                SmallFillOvalButton smallFillOvalButton = (SmallFillOvalButton) objArrI014[4];
                jj2 jj2Var = new jj2(null, view, myketTextView4, loadingIndicator, smallFillOvalButton);
                jj2Var.z = -1L;
                jj2Var.v.setTag(null);
                ((RelativeLayout) objArrI014[0]).setTag(null);
                jj2Var.w.setTag(null);
                jj2Var.l0(view);
                jj2Var.g0();
                return jj2Var;
            case 83:
                if (!"layout/fragment_ad_guard_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_ad_guard is invalid. Received: "));
                }
                Object[] objArrI015 = a79.i0(view, 12, null, vk2.G);
                ImageView imageView4 = (ImageView) objArrI015[8];
                MyketTextView myketTextView5 = (MyketTextView) objArrI015[1];
                View view5 = (View) objArrI015[4];
                SmallBoldTextButton smallBoldTextButton = (SmallBoldTextButton) objArrI015[2];
                vk2 vk2Var = new vk2(null, view, imageView4, myketTextView5, view5, smallBoldTextButton, (MyketTextView) objArrI015[10], (MyketTextView) objArrI015[3], (TryAgainView) objArrI015[11], (LottieAnimationView) objArrI015[6], (View) objArrI015[7]);
                vk2Var.F = -1L;
                ((ConstraintLayout) objArrI015[0]).setTag(null);
                vk2Var.w.setTag(null);
                vk2Var.y.setTag(null);
                vk2Var.A.setTag(null);
                vk2Var.l0(view);
                vk2Var.g0();
                return vk2Var;
            case 84:
                if (!"layout-w1280dp/fragment_add_custom_list_0".equals(obj)) {
                    if (!"layout/fragment_add_custom_list_0".equals(obj)) {
                        throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_add_custom_list is invalid. Received: "));
                    }
                    Object[] objArrI016 = a79.i0(view, 6, xk2.C, xk2.D);
                    xk2 xk2Var = new xk2(null, view, (k12) objArrI016[2], (FrameLayout) objArrI016[1], (ProfileSearchView) objArrI016[3], (FrameLayout) objArrI016[4], (View) objArrI016[5]);
                    xk2Var.B = -1L;
                    k12 k12Var = xk2Var.v;
                    if (k12Var != null) {
                        k12Var.q = xk2Var;
                    }
                    ((ConstraintLayout) objArrI016[0]).setTag(null);
                    xk2Var.w.setTag(null);
                    xk2Var.l0(view);
                    xk2Var.g0();
                    return xk2Var;
                }
                Object[] objArrI017 = a79.i0(view, 7, yk2.C, yk2.D);
                k12 k12Var2 = (k12) objArrI017[3];
                yk2 yk2Var = new yk2(null, view, k12Var2, (FrameLayout) objArrI017[2], (ProfileSearchView) objArrI017[4], (FrameLayout) objArrI017[1], (View) objArrI017[6]);
                yk2Var.B = -1L;
                k12 k12Var3 = yk2Var.v;
                if (k12Var3 != null) {
                    k12Var3.q = yk2Var;
                }
                ((ConstraintLayout) objArrI017[0]).setTag(null);
                yk2Var.w.setTag(null);
                yk2Var.y.setTag(null);
                yk2Var.l0(view);
                yk2Var.g0();
                return yk2Var;
            case 85:
                if (!"layout/fragment_cheetah_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_cheetah is invalid. Received: "));
                }
                Object[] objArrI018 = a79.i0(view, 16, null, bl2.K);
                AppIconView appIconView2 = (AppIconView) objArrI018[12];
                BigFillOvalButton bigFillOvalButton = (BigFillOvalButton) objArrI018[13];
                Group group = (Group) objArrI018[14];
                ImageView imageView5 = (ImageView) objArrI018[9];
                View view6 = (View) objArrI018[4];
                MyketTextView myketTextView6 = (MyketTextView) objArrI018[1];
                View view7 = (View) objArrI018[5];
                SmallBoldTextButton smallBoldTextButton2 = (SmallBoldTextButton) objArrI018[2];
                bl2 bl2Var = new bl2(null, view, appIconView2, bigFillOvalButton, group, imageView5, view6, myketTextView6, view7, smallBoldTextButton2, (MyketTextView) objArrI018[11], (MyketTextView) objArrI018[3], (TryAgainView) objArrI018[15], (LottieAnimationView) objArrI018[7], (View) objArrI018[8]);
                bl2Var.J = -1L;
                bl2Var.z.setTag(null);
                ((ConstraintLayout) objArrI018[0]).setTag(null);
                bl2Var.A.setTag(null);
                bl2Var.C.setTag(null);
                bl2Var.E.setTag(null);
                bl2Var.l0(view);
                bl2Var.g0();
                return bl2Var;
            case 86:
                if (!"layout/fragment_crop_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_crop is invalid. Received: "));
                }
                Object[] objArrI019 = a79.i0(view, 8, null, dl2.y);
                View view8 = (View) objArrI019[1];
                RelativeLayout relativeLayout = (RelativeLayout) objArrI019[0];
                dl2 dl2Var = new dl2(null, view, view8, relativeLayout);
                dl2Var.x = -1L;
                ((View) dl2Var.v).setTag(null);
                ((RelativeLayout) dl2Var.w).setTag(null);
                dl2Var.l0(view);
                dl2Var.g0();
                return dl2Var;
            case 87:
                if (!"layout/fragment_intro_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_intro is invalid. Received: "));
                }
                Object[] objArrI020 = a79.i0(view, 11, null, gl2.H);
                View view9 = (View) objArrI020[1];
                View view10 = (View) objArrI020[2];
                SmallEmptyLargeTextOvalButton smallEmptyLargeTextOvalButton = (SmallEmptyLargeTextOvalButton) objArrI020[8];
                BigFillRectangleButton bigFillRectangleButton = (BigFillRectangleButton) objArrI020[9];
                ConstraintLayout constraintLayout5 = (ConstraintLayout) objArrI020[0];
                ProgressBar progressBar = (ProgressBar) objArrI020[3];
                ProgressBar progressBar2 = (ProgressBar) objArrI020[4];
                ProgressBar progressBar3 = (ProgressBar) objArrI020[5];
                ProgressBar progressBar4 = (ProgressBar) objArrI020[6];
                gl2 gl2Var = new gl2(null, view, view9, view10, smallEmptyLargeTextOvalButton, bigFillRectangleButton, constraintLayout5, progressBar, progressBar2, progressBar3, progressBar4, (ViewPager2) objArrI020[7]);
                gl2Var.G = -1L;
                gl2Var.z.setTag(null);
                gl2Var.l0(view);
                gl2Var.g0();
                return gl2Var;
            case 88:
                if (!"layout/fragment_intro_notification_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_intro_notification is invalid. Received: "));
                }
                Object[] objArrI021 = a79.i0(view, 6, null, il2.C);
                il2 il2Var = new il2(null, view, (MyketTextView) objArrI021[3], (MyketTextView) objArrI021[2], (BigFillRectangleButton) objArrI021[5], (ImageView) objArrI021[4], (MyketTextView) objArrI021[1]);
                il2Var.B = -1L;
                il2Var.v.setTag(null);
                il2Var.w.setTag(null);
                ((ConstraintLayout) objArrI021[0]).setTag(null);
                il2Var.z.setTag(null);
                il2Var.l0(view);
                il2Var.g0();
                return il2Var;
            case 89:
                if (!"layout/fragment_login_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_login is invalid. Received: "));
                }
                Object[] objArrI022 = a79.i0(view, 6, null, nl2.D);
                nl2 nl2Var = new nl2(null, view, (MyketTextView) objArrI022[2], (MyketInputLayout) objArrI022[1], (DialogButtonComponent) objArrI022[5], (BindAutoCompleteView) objArrI022[4], (MyketTextView) objArrI022[3], (ConstraintLayout) objArrI022[0]);
                nl2Var.C = -1L;
                nl2Var.v.setTag(null);
                nl2Var.w.setTag(null);
                nl2Var.z.setTag(null);
                nl2Var.A.setTag(null);
                nl2Var.l0(view);
                nl2Var.g0();
                return nl2Var;
            case 90:
                if (!"layout/fragment_movie_seasons_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_movie_seasons is invalid. Received: "));
                }
                zl2 zl2Var = new zl2(null, view, (ConstraintLayout) a79.i0(view, 1, null, null)[0]);
                zl2Var.w = -1L;
                zl2Var.v.setTag(null);
                zl2Var.l0(view);
                zl2Var.g0();
                return zl2Var;
            case 91:
                if (!"layout/fragment_own_profile_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_own_profile is invalid. Received: "));
                }
                Object[] objArrI023 = a79.i0(view, 11, jm2.F, jm2.G);
                FrameLayout frameLayout4 = (FrameLayout) objArrI023[7];
                FrameLayout frameLayout5 = (FrameLayout) objArrI023[8];
                r63 r63Var = (r63) objArrI023[2];
                ProfileTabView profileTabView = (ProfileTabView) objArrI023[9];
                jm2 jm2Var = new jm2(null, view, frameLayout4, frameLayout5, r63Var, profileTabView, (View) objArrI023[4], (ProfileTabView) objArrI023[6], (NestedScrollView) objArrI023[3], (TryAgainView) objArrI023[10]);
                jm2Var.E = -1L;
                ((FrameLayout) objArrI023[0]).setTag(null);
                ((ConstraintLayout) objArrI023[1]).setTag(null);
                r63 r63Var2 = jm2Var.x;
                if (r63Var2 != null) {
                    r63Var2.q = jm2Var;
                }
                jm2Var.l0(view);
                jm2Var.g0();
                return jm2Var;
            case 92:
                if (!"layout/fragment_reels_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_reels is invalid. Received: "));
                }
                Object[] objArrI024 = a79.i0(view, 8, null, lm2.E);
                lm2 lm2Var = new lm2(null, view, (ImageView) objArrI024[7], (MyketTextView) objArrI024[2], (LoadingView) objArrI024[5], (FrameLayout) objArrI024[4], (MyketTextView) objArrI024[3], (View) objArrI024[6], (ViewPager2) objArrI024[1]);
                lm2Var.D = -1L;
                lm2Var.w.setTag(null);
                ((FrameLayout) objArrI024[0]).setTag(null);
                lm2Var.z.setTag(null);
                lm2Var.B.setTag(null);
                lm2Var.l0(view);
                lm2Var.g0();
                return lm2Var;
            case 93:
                if (!"layout/fragment_search_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_search is invalid. Received: "));
                }
                Object[] objArrI025 = a79.i0(view, 4, null, om2.A);
                om2 om2Var = new om2(null, view, (FragmentContainerView) objArrI025[3], (View) objArrI025[2], (FrameLayout) objArrI025[1]);
                om2Var.z = -1L;
                om2Var.w.setTag(null);
                ((RelativeLayout) objArrI025[0]).setTag(null);
                om2Var.x.setTag(null);
                om2Var.l0(view);
                om2Var.g0();
                return om2Var;
            case 94:
                if ("layout/fragment_search_result_0".equals(obj)) {
                    return new qm2(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_search_result is invalid. Received: "));
            case 95:
                if (!"layout/fragment_send_app_detail_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_send_app_detail is invalid. Received: "));
                }
                Object[] objArrI026 = a79.i0(view, 6, null, sm2.C);
                sm2 sm2Var = new sm2(null, view, (AppIconView) objArrI026[3], (MyketTextView) objArrI026[1], (MyketTextView) objArrI026[2], (PikaReceiveView) objArrI026[4], (ConstraintLayout) objArrI026[0], (BigFillRectangleButton) objArrI026[5]);
                sm2Var.B = -1L;
                sm2Var.w.setTag(null);
                sm2Var.x.setTag(null);
                sm2Var.z.setTag(null);
                sm2Var.l0(view);
                sm2Var.g0();
                return sm2Var;
            case 96:
                if (!"layout/fragment_single_image_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_single_image is invalid. Received: "));
                }
                Object[] objArrI027 = a79.i0(view, 3, null, um2.z);
                um2 um2Var = new um2(null, view, (ImageView) objArrI027[2], (LoadingView) objArrI027[1]);
                um2Var.y = -1L;
                ((ConstraintLayout) objArrI027[0]).setTag(null);
                um2Var.l0(view);
                um2Var.g0();
                return um2Var;
            case 97:
                if (!"layout/fragment_togo_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_togo is invalid. Received: "));
                }
                Object[] objArrI028 = a79.i0(view, 5, null, bn2.B);
                bn2 bn2Var = new bn2(null, view, (View) objArrI028[1], (View) objArrI028[4], (TryAgainView) objArrI028[3], (MyketWebView) objArrI028[2]);
                bn2Var.A = -1L;
                bn2Var.v.setTag(null);
                ((RelativeLayout) objArrI028[0]).setTag(null);
                bn2Var.l0(view);
                bn2Var.g0();
                return bn2Var;
            case 98:
                if ("layout-w1280dp/fragment_try_again_0".equals(obj)) {
                    Object[] objArrI029 = a79.i0(view, 7, null, sn2.D);
                    sn2 sn2Var = new sn2(null, view, (MyketTextView) objArrI029[1], (LottieAnimationView) objArrI029[4], (LoadingIndicator) objArrI029[2], (BigEmptyOvalButton) objArrI029[6], (BigFillOvalButton) objArrI029[5], (Group) objArrI029[3]);
                    sn2Var.C = -1L;
                    sn2Var.v.setTag(null);
                    ((ConstraintLayout) objArrI029[0]).setTag(null);
                    sn2Var.x.setTag(null);
                    sn2Var.l0(view);
                    sn2Var.g0();
                    return sn2Var;
                }
                if (!"layout/fragment_try_again_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_try_again is invalid. Received: "));
                }
                Object[] objArrI030 = a79.i0(view, 7, null, rn2.D);
                rn2 rn2Var = new rn2(null, view, (MyketTextView) objArrI030[1], (LottieAnimationView) objArrI030[3], (LoadingIndicator) objArrI030[2], (BigEmptyOvalButton) objArrI030[5], (BigFillOvalButton) objArrI030[4], (Group) objArrI030[6]);
                rn2Var.C = -1L;
                rn2Var.v.setTag(null);
                ((ConstraintLayout) objArrI030[0]).setTag(null);
                rn2Var.x.setTag(null);
                rn2Var.l0(view);
                rn2Var.g0();
                return rn2Var;
            case 99:
                if ("layout/fragment_unbind_all_bind_state_0".equals(obj)) {
                    Object[] objArrI031 = a79.i0(view, 3, null, vn2.z);
                    vn2 vn2Var = new vn2(null, view, (DialogButtonComponent) objArrI031[2], (MyketTextView) objArrI031[1]);
                    vn2Var.y = -1L;
                    vn2Var.w.setTag(null);
                    ((ConstraintLayout) objArrI031[0]).setTag(null);
                    vn2Var.l0(view);
                    vn2Var.g0();
                    return vn2Var;
                }
                if (!"layout-fa/fragment_unbind_all_bind_state_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_unbind_all_bind_state is invalid. Received: "));
                }
                Object[] objArrI032 = a79.i0(view, 3, null, un2.z);
                un2 un2Var = new un2(null, view, (DialogButtonComponent) objArrI032[2], (MyketTextView) objArrI032[1]);
                un2Var.y = -1L;
                un2Var.w.setTag(null);
                ((ConstraintLayout) objArrI032[0]).setTag(null);
                un2Var.l0(view);
                un2Var.g0();
                return un2Var;
            case 100:
                if (!"layout/fragment_verify_bind_state_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for fragment_verify_bind_state is invalid. Received: "));
                }
                Object[] objArrI033 = a79.i0(view, 13, null, xn2.K);
                xn2 xn2Var = new xn2(null, view, (MyketTextView) objArrI033[3], (MyketInputLayout) objArrI033[2], (DialogButtonComponent) objArrI033[12], (MyketEditText) objArrI033[11], (ConstraintLayout) objArrI033[0], (SmallRegularTextButton) objArrI033[7], (FrameLayout) objArrI033[6], (SmallRegularTextButton) objArrI033[9], (FrameLayout) objArrI033[8], (View) objArrI033[10], (SmallBoldTextButton) objArrI033[5], (MyketTextView) objArrI033[4], (MyketTextView) objArrI033[1]);
                xn2Var.J = -1L;
                xn2Var.v.setTag(null);
                xn2Var.w.setTag(null);
                xn2Var.z.setTag(null);
                xn2Var.A.setTag(null);
                xn2Var.B.setTag(null);
                xn2Var.C.setTag(null);
                xn2Var.D.setTag(null);
                xn2Var.E.setTag(null);
                xn2Var.F.setTag(null);
                xn2Var.G.setTag(null);
                xn2Var.H.setTag(null);
                xn2Var.l0(view);
                xn2Var.g0();
                return xn2Var;
            default:
                return null;
        }
    }

    public static a79 g(int i, View view, Object obj) {
        switch (i) {
            case 151:
                if ("layout/holder_more_clickable_0".equals(obj)) {
                    return new f43(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_more_clickable is invalid. Received: "));
            case 152:
                if ("layout/holder_more_information_0".equals(obj)) {
                    return new f50(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_more_information is invalid. Received: "));
            case 153:
                if ("layout/holder_more_size_0".equals(obj)) {
                    return new g43(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_more_size is invalid. Received: "));
            case 154:
                if (!"layout/holder_more_streamers_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_more_streamers is invalid. Received: "));
                }
                Object[] objArrI0 = a79.i0(view, 3, null, i43.z);
                i43 i43Var = new i43(null, view, (ConstraintLayout) objArrI0[0], (MyketTextView) objArrI0[1], (SmallBoldTextButton) objArrI0[2]);
                i43Var.y = -1L;
                i43Var.v.setTag(null);
                i43Var.l0(view);
                i43Var.g0();
                return i43Var;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                if ("layout/holder_more_version_0".equals(obj)) {
                    return new j43(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_more_version is invalid. Received: "));
            case 156:
                if ("layout/holder_movie_banner_0".equals(obj)) {
                    return new l43(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_banner is invalid. Received: "));
            case 157:
                if ("layout/holder_movie_banners_item_0".equals(obj)) {
                    return new n43(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_banners_item is invalid. Received: "));
            case 158:
                if ("layout/holder_movie_bookmark_0".equals(obj)) {
                    return new p43(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_bookmark is invalid. Received: "));
            case 159:
                if ("layout-fa/holder_movie_cast_title_0".equals(obj)) {
                    return new q43(0, view);
                }
                if ("layout/holder_movie_cast_title_0".equals(obj)) {
                    return new q43(1, view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_cast_title is invalid. Received: "));
            case 160:
                if (!"layout/holder_movie_download_episode_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_download_episode is invalid. Received: "));
                }
                Object[] objArrI02 = a79.i0(view, 6, null, s43.B);
                ScreenshotView screenshotView = (ScreenshotView) objArrI02[3];
                s43 s43Var = new s43(null, view, screenshotView, (FrameLayout) objArrI02[0], (MovieDownloadButton) objArrI02[4], (MyketTextView) objArrI02[2], (MyketTextView) objArrI02[1]);
                s43Var.A = -1L;
                s43Var.w.setTag(null);
                s43Var.y.setTag(null);
                s43Var.z.setTag(null);
                s43Var.l0(view);
                s43Var.g0();
                return s43Var;
            case 161:
                if (!"layout/holder_movie_download_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_download_item is invalid. Received: "));
                }
                Object[] objArrI03 = a79.i0(view, 12, null, u43.G);
                ScreenshotView screenshotView2 = (ScreenshotView) objArrI03[8];
                u43 u43Var = new u43(null, view, screenshotView2, (FrameLayout) objArrI03[0], (LoadingView) objArrI03[10], (ImageView) objArrI03[11], (MyketTextView) objArrI03[5], (MyketTextView) objArrI03[3], (MyketTextView) objArrI03[2], (SeriesBackground) objArrI03[7], (MyketTextView) objArrI03[4], (MyketTextView) objArrI03[1]);
                u43Var.F = -1L;
                u43Var.w.setTag(null);
                u43Var.z.setTag(null);
                u43Var.A.setTag(null);
                u43Var.B.setTag(null);
                u43Var.D.setTag(null);
                u43Var.E.setTag(null);
                u43Var.l0(view);
                u43Var.g0();
                return u43Var;
            case 162:
                if (!"layout/holder_movie_episode_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_episode is invalid. Received: "));
                }
                Object[] objArrI04 = a79.i0(view, 8, null, w43.E);
                w43 w43Var = new w43(null, view, (ScreenshotView) objArrI04[4], (FrameLayout) objArrI04[0], (SmallMovieOvalButton) objArrI04[7], (MyketTextView) objArrI04[3], (View) objArrI04[5], (MovieNewTagView) objArrI04[1], (MyketTextView) objArrI04[2], (ProgressBar) objArrI04[6]);
                w43Var.D = -1L;
                w43Var.w.setTag(null);
                w43Var.y.setTag(null);
                w43Var.A.setTag(null);
                w43Var.B.setTag(null);
                w43Var.l0(view);
                w43Var.g0();
                return w43Var;
            case 163:
                if ("layout/holder_movie_episode_more_0".equals(obj)) {
                    return new y43(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_episode_more is invalid. Received: "));
            case 164:
                if ("layout/holder_movie_horizontal_banner_list_0".equals(obj)) {
                    return new z43(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_horizontal_banner_list is invalid. Received: "));
            case 165:
                if ("layout/holder_movie_horizontal_large_banner_list_0".equals(obj)) {
                    return new a53(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_horizontal_large_banner_list is invalid. Received: "));
            case 166:
                if (!"layout/holder_movie_horizontal_list_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_horizontal_list is invalid. Received: "));
                }
                Object[] objArrI05 = a79.i0(view, 6, null, c53.B);
                LinearLayout linearLayout = (LinearLayout) objArrI05[0];
                ConstraintLayout constraintLayout = (ConstraintLayout) objArrI05[1];
                AlphaAnimationView alphaAnimationView = (AlphaAnimationView) objArrI05[2];
                MyketTextView myketTextView = (MyketTextView) objArrI05[3];
                c53 c53Var = new c53(null, view, linearLayout, constraintLayout, alphaAnimationView, myketTextView, (SmallBoldTextButton) objArrI05[4]);
                c53Var.A = -1L;
                c53Var.v.setTag(null);
                c53Var.w.setTag(null);
                c53Var.l0(view);
                c53Var.g0();
                return c53Var;
            case 167:
                if ("layout/holder_movie_horizontal_medium_banner_list_0".equals(obj)) {
                    return new d53(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_horizontal_medium_banner_list is invalid. Received: "));
            case 168:
                if (!"layout/holder_movie_image_background_horizontal_list_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_image_background_horizontal_list is invalid. Received: "));
                }
                Object[] objArrI06 = a79.i0(view, 8, null, f53.C);
                RelativeLayout relativeLayout = (RelativeLayout) objArrI06[0];
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI06[2];
                MyketTextView myketTextView2 = (MyketTextView) objArrI06[5];
                ImageView imageView = (ImageView) objArrI06[3];
                f53 f53Var = new f53(null, view, relativeLayout, constraintLayout2, myketTextView2, imageView, (SmallBoldTextButton) objArrI06[6], (View) objArrI06[1]);
                f53Var.B = -1L;
                f53Var.v.setTag(null);
                f53Var.w.setTag(null);
                f53Var.A.setTag(null);
                f53Var.l0(view);
                f53Var.g0();
                return f53Var;
            case 169:
                if ("layout-fa/holder_movie_list_title_0".equals(obj)) {
                    Object[] objArrI07 = a79.i0(view, 3, null, h53.y);
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) objArrI07[0];
                    MyketTextView myketTextView3 = (MyketTextView) objArrI07[1];
                    h53 h53Var = new h53(null, view, constraintLayout3, myketTextView3);
                    h53Var.x = -1L;
                    h53Var.v.setTag(null);
                    h53Var.w.setTag(null);
                    h53Var.l0(view);
                    h53Var.g0();
                    return h53Var;
                }
                if (!"layout/holder_movie_list_title_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_list_title is invalid. Received: "));
                }
                Object[] objArrI08 = a79.i0(view, 3, null, i53.y);
                ConstraintLayout constraintLayout4 = (ConstraintLayout) objArrI08[0];
                MyketTextView myketTextView4 = (MyketTextView) objArrI08[1];
                i53 i53Var = new i53(null, view, constraintLayout4, myketTextView4);
                i53Var.x = -1L;
                i53Var.v.setTag(null);
                i53Var.w.setTag(null);
                i53Var.l0(view);
                i53Var.g0();
                return i53Var;
            case 170:
                if ("layout/holder_movie_multi_select_bookmark_0".equals(obj)) {
                    return new k53(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_multi_select_bookmark is invalid. Received: "));
            case 171:
                if ("layout/holder_movie_review_0".equals(obj)) {
                    Object[] objArrI09 = a79.i0(view, 12, null, n53.H);
                    AvatarImageView avatarImageView = (AvatarImageView) objArrI09[8];
                    MyketTextView myketTextView5 = (MyketTextView) objArrI09[2];
                    LinearLayout linearLayout2 = (LinearLayout) objArrI09[0];
                    MyketTextView myketTextView6 = (MyketTextView) objArrI09[5];
                    BuzzProgressImageView buzzProgressImageView = (BuzzProgressImageView) objArrI09[11];
                    MyketTextView myketTextView7 = (MyketTextView) objArrI09[4];
                    n53 n53Var = new n53(null, view, avatarImageView, myketTextView5, linearLayout2, myketTextView6, buzzProgressImageView, myketTextView7, (BuzzProgressImageView) objArrI09[10], (MyketTextView) objArrI09[3], (MyketTextView) objArrI09[9], (MyketImageButton) objArrI09[6], (MyketTextView) objArrI09[1]);
                    n53Var.G = -1L;
                    n53Var.w.setTag(null);
                    n53Var.x.setTag(null);
                    n53Var.y.setTag(null);
                    n53Var.A.setTag(null);
                    n53Var.C.setTag(null);
                    n53Var.E.setTag(null);
                    n53Var.F.setTag(null);
                    n53Var.l0(view);
                    n53Var.g0();
                    return n53Var;
                }
                if (!"layout-fa/holder_movie_review_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_review is invalid. Received: "));
                }
                Object[] objArrI010 = a79.i0(view, 12, null, m53.H);
                AvatarImageView avatarImageView2 = (AvatarImageView) objArrI010[8];
                MyketTextView myketTextView8 = (MyketTextView) objArrI010[2];
                LinearLayout linearLayout3 = (LinearLayout) objArrI010[0];
                MyketTextView myketTextView9 = (MyketTextView) objArrI010[5];
                BuzzProgressImageView buzzProgressImageView2 = (BuzzProgressImageView) objArrI010[11];
                MyketTextView myketTextView10 = (MyketTextView) objArrI010[4];
                m53 m53Var = new m53(null, view, avatarImageView2, myketTextView8, linearLayout3, myketTextView9, buzzProgressImageView2, myketTextView10, (BuzzProgressImageView) objArrI010[10], (MyketTextView) objArrI010[3], (MyketTextView) objArrI010[9], (MyketImageButton) objArrI010[6], (MyketTextView) objArrI010[1]);
                m53Var.G = -1L;
                m53Var.w.setTag(null);
                m53Var.x.setTag(null);
                m53Var.y.setTag(null);
                m53Var.A.setTag(null);
                m53Var.C.setTag(null);
                m53Var.E.setTag(null);
                m53Var.F.setTag(null);
                m53Var.l0(view);
                m53Var.g0();
                return m53Var;
            case 172:
                if ("layout/holder_movie_review_more_0".equals(obj)) {
                    return new p53(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_review_more is invalid. Received: "));
            case 173:
                if (!"layout/holder_movie_screenshot_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_screenshot is invalid. Received: "));
                }
                Object[] objArrI011 = a79.i0(view, 4, null, r53.z);
                r53 r53Var = new r53(null, view, (FrameLayout) objArrI011[3], (MyketTextView) objArrI011[1], (ScreenshotView) objArrI011[2]);
                r53Var.y = -1L;
                ((ConstraintLayout) objArrI011[0]).setTag(null);
                r53Var.x.setTag(null);
                r53Var.l0(view);
                r53Var.g0();
                return r53Var;
            case 174:
                if (!"layout/holder_movie_screenshots_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_screenshots is invalid. Received: "));
                }
                Object[] objArrI012 = a79.i0(view, 3, null, t53.x);
                t53 t53Var = new t53(null, view, (MyketTextView) objArrI012[1]);
                t53Var.w = -1L;
                ((ConstraintLayout) objArrI012[0]).setTag(null);
                t53Var.v.setTag(null);
                t53Var.l0(view);
                t53Var.g0();
                return t53Var;
            case 175:
                if ("layout/holder_movie_season_title_0".equals(obj)) {
                    return new u53(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_season_title is invalid. Received: "));
            case 176:
                if (!"layout/holder_movie_single_movie_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_single_movie is invalid. Received: "));
                }
                Object[] objArrI013 = a79.i0(view, 6, null, w53.C);
                w53 w53Var = new w53(null, view, (ScreenshotView) objArrI013[5], (FrameLayout) objArrI013[0], (MyketTextView) objArrI013[4], (MyketTextView) objArrI013[3], (MyketTextView) objArrI013[2], (MyketTextView) objArrI013[1]);
                w53Var.B = -1L;
                w53Var.w.setTag(null);
                w53Var.x.setTag(null);
                w53Var.y.setTag(null);
                w53Var.z.setTag(null);
                w53Var.A.setTag(null);
                w53Var.l0(view);
                w53Var.g0();
                return w53Var;
            case 177:
                if ("layout/holder_movie_tablet_banner_0".equals(obj)) {
                    Object[] objArrI014 = a79.i0(view, 9, null, y53.E);
                    y53 y53Var = new y53(null, view, (SmallBoldTextButton) objArrI014[4], (FrameLayout) objArrI014[3], (ScreenshotView) objArrI014[8], (ScreenshotView) objArrI014[6], (View) objArrI014[7], (FrameLayout) objArrI014[5], (MyketTextView) objArrI014[2], (MyketTextView) objArrI014[1]);
                    y53Var.D = -1L;
                    y53Var.v.setTag(null);
                    y53Var.w.setTag(null);
                    ((ConstraintLayout) objArrI014[0]).setTag(null);
                    y53Var.B.setTag(null);
                    y53Var.C.setTag(null);
                    y53Var.l0(view);
                    y53Var.g0();
                    return y53Var;
                }
                if (!"layout-w1280dp/holder_movie_tablet_banner_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_tablet_banner is invalid. Received: "));
                }
                Object[] objArrI015 = a79.i0(view, 9, null, z53.E);
                z53 z53Var = new z53(null, view, (SmallBoldTextButton) objArrI015[4], (FrameLayout) objArrI015[3], (ScreenshotView) objArrI015[8], (ScreenshotView) objArrI015[6], (View) objArrI015[7], (FrameLayout) objArrI015[5], (MyketTextView) objArrI015[2], (MyketTextView) objArrI015[1]);
                z53Var.D = -1L;
                z53Var.v.setTag(null);
                z53Var.w.setTag(null);
                ((ConstraintLayout) objArrI015[0]).setTag(null);
                z53Var.B.setTag(null);
                z53Var.C.setTag(null);
                z53Var.l0(view);
                z53Var.g0();
                return z53Var;
            case 178:
                if (!"layout/holder_movie_trailer_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_movie_trailer is invalid. Received: "));
                }
                Object[] objArrI016 = a79.i0(view, 3, null, b63.y);
                b63 b63Var = new b63(null, view, (MyketTextView) objArrI016[1], (MyketVideoView) objArrI016[2]);
                b63Var.x = -1L;
                ((ConstraintLayout) objArrI016[0]).setTag(null);
                b63Var.v.setTag(null);
                b63Var.l0(view);
                b63Var.g0();
                return b63Var;
            case 179:
                if ("layout/holder_multi_select_bookmark_0".equals(obj)) {
                    return new d63(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_multi_select_bookmark is invalid. Received: "));
            case 180:
                if ("layout/holder_multi_select_download_0".equals(obj)) {
                    return new f63(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_multi_select_download is invalid. Received: "));
            case 181:
                if ("layout/holder_my_myket_new_0".equals(obj)) {
                    return new g63(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_my_myket_new is invalid. Received: "));
            case 182:
                if (!"layout/holder_new_version_header_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_new_version_header is invalid. Received: "));
                }
                h63 h63Var = new h63(null, view, (MyketTextView) a79.i0(view, 1, null, null)[0]);
                h63Var.w = -1L;
                h63Var.v.setTag(null);
                h63Var.l0(view);
                h63Var.g0();
                return h63Var;
            case 183:
                if ("layout/holder_new_version_row_0".equals(obj)) {
                    i63 i63Var = new i63(null, view, (MyketTextView) a79.i0(view, 1, null, null)[0], 1);
                    i63Var.x = -1L;
                    i63Var.v.setTag(null);
                    i63Var.l0(view);
                    i63Var.g0();
                    return i63Var;
                }
                if (!"layout-fa/holder_new_version_row_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_new_version_row is invalid. Received: "));
                }
                i63 i63Var2 = new i63(null, view, (MyketTextView) a79.i0(view, 1, null, null)[0], 0);
                i63Var2.x = -1L;
                i63Var2.v.setTag(null);
                i63Var2.l0(view);
                i63Var2.g0();
                return i63Var2;
            case 184:
                if (!"layout/holder_other_streamer_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_other_streamer is invalid. Received: "));
                }
                Object[] objArrI017 = a79.i0(view, 6, null, k63.B);
                k63 k63Var = new k63(null, view, (AvatarImageView) objArrI017[5], (FrameLayout) objArrI017[3], (View) objArrI017[4], (MyketTextView) objArrI017[2], (MyketTextView) objArrI017[1]);
                k63Var.A = -1L;
                k63Var.w.setTag(null);
                k63Var.y.setTag(null);
                ((ConstraintLayout) objArrI017[0]).setTag(null);
                k63Var.z.setTag(null);
                k63Var.l0(view);
                k63Var.g0();
                return k63Var;
            case 185:
                if (!"layout/holder_other_streamer_row_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_other_streamer_row is invalid. Received: "));
                }
                l63 l63Var = new l63(null, view, (HorizontalRecyclerView) a79.i0(view, 1, null, null)[0], 0);
                l63Var.w = -1L;
                ((HorizontalRecyclerView) l63Var.x).setTag(null);
                l63Var.l0(view);
                l63Var.g0();
                return l63Var;
            case 186:
                if ("layout-w960dp/holder_own_profile_action_0".equals(obj)) {
                    Object[] objArrI018 = a79.i0(view, 3, null, o63.y);
                    o63 o63Var = new o63(null, view, (SmallEmptyMediumTextOvalButton) objArrI018[1], (SmallEmptyMediumTextOvalButton) objArrI018[2]);
                    o63Var.x = -1L;
                    ((ConstraintLayout) objArrI018[0]).setTag(null);
                    o63Var.l0(view);
                    o63Var.g0();
                    return o63Var;
                }
                if (!"layout/holder_own_profile_action_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_own_profile_action is invalid. Received: "));
                }
                Object[] objArrI019 = a79.i0(view, 3, null, n63.y);
                n63 n63Var = new n63(null, view, (SmallEmptyMediumTextOvalButton) objArrI019[1], (SmallEmptyMediumTextOvalButton) objArrI019[2]);
                n63Var.x = -1L;
                ((ConstraintLayout) objArrI019[0]).setTag(null);
                n63Var.l0(view);
                n63Var.g0();
                return n63Var;
            case 187:
                if ("layout/holder_own_profile_follow_request_0".equals(obj)) {
                    return new q63(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_own_profile_follow_request is invalid. Received: "));
            case 188:
                if ("layout-w960dp/holder_own_profile_header_0".equals(obj)) {
                    return new t63(view);
                }
                if ("layout/holder_own_profile_header_0".equals(obj)) {
                    return new s63(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_own_profile_header is invalid. Received: "));
            case 189:
                if ("layout/holder_own_profile_info_0".equals(obj)) {
                    return new v63(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_own_profile_info is invalid. Received: "));
            case 190:
                if (!"layout/holder_own_profile_tip_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_own_profile_tip is invalid. Received: "));
                }
                Object[] objArrI020 = a79.i0(view, 4, null, x63.A);
                MyketTextView myketTextView11 = (MyketTextView) objArrI020[2];
                x63 x63Var = new x63(null, view, (ImageView) objArrI020[3], (ConstraintLayout) objArrI020[0], myketTextView11, (MyketTextView) objArrI020[1]);
                x63Var.z = -1L;
                x63Var.v.setTag(null);
                x63Var.w.setTag(null);
                x63Var.y.setTag(null);
                x63Var.l0(view);
                x63Var.g0();
                return x63Var;
            case 191:
                if ("layout/holder_own_review_0".equals(obj)) {
                    Object[] objArrI021 = a79.i0(view, 23, null, a73.S);
                    ImageView imageView2 = (ImageView) objArrI021[17];
                    MyketTextView myketTextView12 = (MyketTextView) objArrI021[5];
                    FrameLayout frameLayout = (FrameLayout) objArrI021[0];
                    MyketTextView myketTextView13 = (MyketTextView) objArrI021[6];
                    MyketTextView myketTextView14 = (MyketTextView) objArrI021[11];
                    MyketTextView myketTextView15 = (MyketTextView) objArrI021[10];
                    BuzzProgressImageView buzzProgressImageView3 = (BuzzProgressImageView) objArrI021[22];
                    MyketTextView myketTextView16 = (MyketTextView) objArrI021[13];
                    ConstraintLayout constraintLayout5 = (ConstraintLayout) objArrI021[20];
                    BuzzProgressImageView buzzProgressImageView4 = (BuzzProgressImageView) objArrI021[21];
                    MyketTextView myketTextView17 = (MyketTextView) objArrI021[12];
                    MyketTextView myketTextView18 = (MyketTextView) objArrI021[9];
                    BuzzProgressImageView buzzProgressImageView5 = (BuzzProgressImageView) objArrI021[19];
                    MyketTextView myketTextView19 = (MyketTextView) objArrI021[8];
                    SmallRegularTextButton smallRegularTextButton = (SmallRegularTextButton) objArrI021[1];
                    ConstraintLayout constraintLayout6 = (ConstraintLayout) objArrI021[14];
                    BuzzProgressImageView buzzProgressImageView6 = (BuzzProgressImageView) objArrI021[18];
                    MyketTextView myketTextView20 = (MyketTextView) objArrI021[7];
                    View view2 = (View) objArrI021[2];
                    MyketTextView myketTextView21 = (MyketTextView) objArrI021[4];
                    MyketRatingBar myketRatingBar = (MyketRatingBar) objArrI021[16];
                    SmallRegularTextButton smallRegularTextButton2 = (SmallRegularTextButton) objArrI021[3];
                    a73 a73Var = new a73(null, view, imageView2, myketTextView12, frameLayout, myketTextView13, myketTextView14, myketTextView15, buzzProgressImageView3, myketTextView16, constraintLayout5, buzzProgressImageView4, myketTextView17, myketTextView18, buzzProgressImageView5, myketTextView19, smallRegularTextButton, constraintLayout6, buzzProgressImageView6, myketTextView20, view2, myketTextView21, myketRatingBar, smallRegularTextButton2);
                    a73Var.R = -1L;
                    a73Var.w.setTag(null);
                    a73Var.x.setTag(null);
                    a73Var.y.setTag(null);
                    a73Var.z.setTag(null);
                    a73Var.A.setTag(null);
                    a73Var.C.setTag(null);
                    a73Var.F.setTag(null);
                    a73Var.G.setTag(null);
                    a73Var.I.setTag(null);
                    a73Var.J.setTag(null);
                    a73Var.M.setTag(null);
                    a73Var.N.setTag(null);
                    a73Var.O.setTag(null);
                    a73Var.Q.setTag(null);
                    a73Var.l0(view);
                    a73Var.g0();
                    return a73Var;
                }
                if (!"layout-fa/holder_own_review_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_own_review is invalid. Received: "));
                }
                Object[] objArrI022 = a79.i0(view, 23, null, z63.S);
                ImageView imageView3 = (ImageView) objArrI022[17];
                MyketTextView myketTextView22 = (MyketTextView) objArrI022[7];
                FrameLayout frameLayout2 = (FrameLayout) objArrI022[0];
                MyketTextView myketTextView23 = (MyketTextView) objArrI022[8];
                MyketTextView myketTextView24 = (MyketTextView) objArrI022[11];
                MyketTextView myketTextView25 = (MyketTextView) objArrI022[10];
                BuzzProgressImageView buzzProgressImageView7 = (BuzzProgressImageView) objArrI022[22];
                MyketTextView myketTextView26 = (MyketTextView) objArrI022[13];
                ConstraintLayout constraintLayout7 = (ConstraintLayout) objArrI022[20];
                BuzzProgressImageView buzzProgressImageView8 = (BuzzProgressImageView) objArrI022[21];
                MyketTextView myketTextView27 = (MyketTextView) objArrI022[12];
                MyketTextView myketTextView28 = (MyketTextView) objArrI022[9];
                BuzzProgressImageView buzzProgressImageView9 = (BuzzProgressImageView) objArrI022[19];
                MyketTextView myketTextView29 = (MyketTextView) objArrI022[2];
                SmallRegularTextButton smallRegularTextButton3 = (SmallRegularTextButton) objArrI022[3];
                ConstraintLayout constraintLayout8 = (ConstraintLayout) objArrI022[14];
                BuzzProgressImageView buzzProgressImageView10 = (BuzzProgressImageView) objArrI022[18];
                MyketTextView myketTextView30 = (MyketTextView) objArrI022[1];
                View view3 = (View) objArrI022[4];
                MyketTextView myketTextView31 = (MyketTextView) objArrI022[6];
                MyketRatingBar myketRatingBar2 = (MyketRatingBar) objArrI022[16];
                SmallRegularTextButton smallRegularTextButton4 = (SmallRegularTextButton) objArrI022[5];
                z63 z63Var = new z63(null, view, imageView3, myketTextView22, frameLayout2, myketTextView23, myketTextView24, myketTextView25, buzzProgressImageView7, myketTextView26, constraintLayout7, buzzProgressImageView8, myketTextView27, myketTextView28, buzzProgressImageView9, myketTextView29, smallRegularTextButton3, constraintLayout8, buzzProgressImageView10, myketTextView30, view3, myketTextView31, myketRatingBar2, smallRegularTextButton4);
                z63Var.R = -1L;
                z63Var.w.setTag(null);
                z63Var.x.setTag(null);
                z63Var.y.setTag(null);
                z63Var.z.setTag(null);
                z63Var.A.setTag(null);
                z63Var.C.setTag(null);
                z63Var.F.setTag(null);
                z63Var.G.setTag(null);
                z63Var.I.setTag(null);
                z63Var.J.setTag(null);
                z63Var.M.setTag(null);
                z63Var.N.setTag(null);
                z63Var.O.setTag(null);
                z63Var.Q.setTag(null);
                z63Var.l0(view);
                z63Var.g0();
                return z63Var;
            case 192:
                if (!"layout/holder_play_description_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_play_description is invalid. Received: "));
                }
                Object[] objArrI023 = a79.i0(view, 3, null, null);
                b73 b73Var = new b73(null, view, (MyketTextView) objArrI023[2], (MyketTextView) objArrI023[1]);
                b73Var.x = -1L;
                b73Var.v.setTag(null);
                ((ConstraintLayout) objArrI023[0]).setTag(null);
                b73Var.w.setTag(null);
                b73Var.l0(view);
                b73Var.g0();
                return b73Var;
            case 193:
                if (!"layout/holder_play_detail_app_summery_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_play_detail_app_summery is invalid. Received: "));
                }
                Object[] objArrI024 = a79.i0(view, 8, null, d73.D);
                d73 d73Var = new d73(null, view, (AppSummeryView) objArrI024[7], (View) objArrI024[1], (View) objArrI024[2], (View) objArrI024[3], (AppSummeryView) objArrI024[4], (AppSummeryView) objArrI024[6], (AppSummeryView) objArrI024[5]);
                d73Var.C = -1L;
                d73Var.w.setTag(null);
                d73Var.x.setTag(null);
                d73Var.y.setTag(null);
                ((ConstraintLayout) objArrI024[0]).setTag(null);
                d73Var.l0(view);
                d73Var.g0();
                return d73Var;
            case 194:
                if ("layout-w600dp/holder_play_detail_info_0".equals(obj)) {
                    Object[] objArrI025 = a79.i0(view, 6, null, g73.B);
                    g73 g73Var = new g73(null, view, (AppIconView) objArrI025[5], (MyketTextView) objArrI025[1], (MyketTextView) objArrI025[3], (HorizontalRecyclerView) objArrI025[4], (MyketTextView) objArrI025[2]);
                    g73Var.A = -1L;
                    g73Var.w.setTag(null);
                    g73Var.x.setTag(null);
                    ((ConstraintLayout) objArrI025[0]).setTag(null);
                    g73Var.y.setTag(null);
                    g73Var.z.setTag(null);
                    g73Var.l0(view);
                    g73Var.g0();
                    return g73Var;
                }
                if (!"layout/holder_play_detail_info_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_play_detail_info is invalid. Received: "));
                }
                Object[] objArrI026 = a79.i0(view, 6, null, f73.B);
                f73 f73Var = new f73(null, view, (AppIconView) objArrI026[4], (MyketTextView) objArrI026[1], (MyketTextView) objArrI026[3], (HorizontalRecyclerView) objArrI026[5], (MyketTextView) objArrI026[2]);
                f73Var.A = -1L;
                f73Var.w.setTag(null);
                f73Var.x.setTag(null);
                ((ConstraintLayout) objArrI026[0]).setTag(null);
                f73Var.z.setTag(null);
                f73Var.l0(view);
                f73Var.g0();
                return f73Var;
            case 195:
                if (!"layout/holder_play_detail_suggest_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_play_detail_suggest is invalid. Received: "));
                }
                Object[] objArrI027 = a79.i0(view, 4, null, i73.A);
                i73 i73Var = new i73(null, view, (RelativeLayout) objArrI027[0], (ImageView) objArrI027[1], (SmallFillOvalButton) objArrI027[3], (MyketTextView) objArrI027[2]);
                i73Var.z = -1L;
                i73Var.v.setTag(null);
                i73Var.l0(view);
                i73Var.g0();
                return i73Var;
            case 196:
                if (!"layout/holder_play_screenshot_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_play_screenshot is invalid. Received: "));
                }
                Object[] objArrI028 = a79.i0(view, 3, null, k73.x);
                k73 k73Var = new k73(null, view, (ImageView) objArrI028[1]);
                k73Var.w = -1L;
                ((ConstraintLayout) objArrI028[0]).setTag(null);
                k73Var.l0(view);
                k73Var.g0();
                return k73Var;
            case 197:
                if (!"layout/holder_play_screenshot_list_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_play_screenshot_list is invalid. Received: "));
                }
                Object[] objArrI029 = a79.i0(view, 2, null, m73.y);
                m73 m73Var = new m73(null, view, (RelativeLayout) objArrI029[0], (RecyclerView) objArrI029[1]);
                m73Var.x = -1L;
                m73Var.v.setTag(null);
                m73Var.l0(view);
                m73Var.g0();
                return m73Var;
            case 198:
                if (!"layout/holder_quality_select_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_quality_select_item is invalid. Received: "));
                }
                Object[] objArrI030 = a79.i0(view, 5, null, o73.A);
                o73 o73Var = new o73(null, view, (MyketTextView) objArrI030[2], (LoadingView) objArrI030[3], (ImageView) objArrI030[4], (MyketTextView) objArrI030[1]);
                o73Var.z = -1L;
                o73Var.v.setTag(null);
                ((ConstraintLayout) objArrI030[0]).setTag(null);
                o73Var.y.setTag(null);
                o73Var.l0(view);
                o73Var.g0();
                return o73Var;
            case 199:
                if (!"layout/holder_question_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_question is invalid. Received: "));
                }
                Object[] objArrI031 = a79.i0(view, 2, null, null);
                p73 p73Var = new p73(null, view, (MyketTextView) objArrI031[1]);
                p73Var.w = -1L;
                ((ConstraintLayout) objArrI031[0]).setTag(null);
                p73Var.v.setTag(null);
                p73Var.l0(view);
                p73Var.g0();
                return p73Var;
            case ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR /* 200 */:
                if (!"layout/holder_recent_download_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_recent_download is invalid. Received: "));
                }
                Object[] objArrI032 = a79.i0(view, 2, null, null);
                q73 q73Var = new q73(null, view, (MyketTextView) objArrI032[1]);
                q73Var.w = -1L;
                ((ConstraintLayout) objArrI032[0]).setTag(null);
                q73Var.v.setTag(null);
                q73Var.l0(view);
                q73Var.g0();
                return q73Var;
            default:
                return null;
        }
    }

    public static a79 h(int i, View view, Object obj) {
        switch (i) {
            case 201:
                if ("layout/holder_reel_horizontal_grid_list_0".equals(obj)) {
                    return new r73(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_reel_horizontal_grid_list is invalid. Received: "));
            case 202:
                if ("layout/holder_reel_horizontal_large_list_0".equals(obj)) {
                    return new s73(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_reel_horizontal_large_list is invalid. Received: "));
            case 203:
                if ("layout/holder_reel_horizontal_medium_list_0".equals(obj)) {
                    return new t73(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_reel_horizontal_medium_list is invalid. Received: "));
            case 204:
                if ("layout/holder_reel_horizontal_small_list_0".equals(obj)) {
                    return new u73(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_reel_horizontal_small_list is invalid. Received: "));
            case 205:
                if (!"layout/holder_reel_list_title_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_reel_list_title is invalid. Received: "));
                }
                Object[] objArrI0 = a79.i0(view, 3, null, w73.y);
                ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
                w73 w73Var = new w73(null, view, constraintLayout, (MyketTextView) objArrI0[1]);
                w73Var.x = -1L;
                w73Var.v.setTag(null);
                w73Var.w.setTag(null);
                w73Var.l0(view);
                w73Var.g0();
                return w73Var;
            case 206:
                if ("layout/holder_requests_item_0".equals(obj)) {
                    return new y73(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_requests_item is invalid. Received: "));
            case 207:
                if ("layout-fa/holder_scan_device_0".equals(obj)) {
                    Object[] objArrI02 = a79.i0(view, 6, null, a83.B);
                    a83 a83Var = new a83(null, view, (LottieAnimationView) objArrI02[4], (MyketTextView) objArrI02[3], (MyketTextView) objArrI02[2], (AppCompatImageView) objArrI02[5], (MyketTextView) objArrI02[1]);
                    a83Var.A = -1L;
                    a83Var.w.setTag(null);
                    ((ConstraintLayout) objArrI02[0]).setTag(null);
                    a83Var.x.setTag(null);
                    a83Var.z.setTag(null);
                    a83Var.l0(view);
                    a83Var.g0();
                    return a83Var;
                }
                if (!"layout/holder_scan_device_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_scan_device is invalid. Received: "));
                }
                Object[] objArrI03 = a79.i0(view, 6, null, b83.B);
                b83 b83Var = new b83(null, view, (LottieAnimationView) objArrI03[4], (MyketTextView) objArrI03[3], (MyketTextView) objArrI03[2], (AppCompatImageView) objArrI03[5], (MyketTextView) objArrI03[1]);
                b83Var.A = -1L;
                b83Var.w.setTag(null);
                ((ConstraintLayout) objArrI03[0]).setTag(null);
                b83Var.x.setTag(null);
                b83Var.z.setTag(null);
                b83Var.l0(view);
                b83Var.g0();
                return b83Var;
            case 208:
                if (!"layout/holder_scan_tip_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_scan_tip is invalid. Received: "));
                }
                Object[] objArrI04 = a79.i0(view, 4, null, d83.A);
                d83 d83Var = new d83(null, view, (ImageView) objArrI04[3], (ConstraintLayout) objArrI04[0], (MyketTextView) objArrI04[2], (MyketTextView) objArrI04[1]);
                d83Var.z = -1L;
                d83Var.v.setTag(null);
                d83Var.x.setTag(null);
                d83Var.y.setTag(null);
                d83Var.l0(view);
                d83Var.g0();
                return d83Var;
            case 209:
                if (!"layout/holder_schedule_time_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_schedule_time is invalid. Received: "));
                }
                Object[] objArrI05 = a79.i0(view, 6, null, null);
                e83 e83Var = new e83(null, view, (MyketTextView) objArrI05[2], (MyketTextView) objArrI05[5], (FrameLayout) objArrI05[0], (MyketTextView) objArrI05[3], (MyketTextView) objArrI05[1], (MyketTextView) objArrI05[4]);
                e83Var.B = -1L;
                e83Var.v.setTag(null);
                e83Var.w.setTag(null);
                e83Var.x.setTag(null);
                e83Var.y.setTag(null);
                e83Var.z.setTag(null);
                e83Var.A.setTag(null);
                e83Var.l0(view);
                e83Var.g0();
                return e83Var;
            case 210:
                if (!"layout/holder_schedule_tip_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_schedule_tip is invalid. Received: "));
                }
                Object[] objArrI06 = a79.i0(view, 2, null, null);
                f83 f83Var = new f83(null, view, (FrameLayout) objArrI06[0], (MyketTextView) objArrI06[1]);
                f83Var.x = -1L;
                f83Var.v.setTag(null);
                f83Var.w.setTag(null);
                f83Var.l0(view);
                f83Var.g0();
                return f83Var;
            case 211:
                if (!"layout/holder_schedule_type_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_schedule_type is invalid. Received: "));
                }
                Object[] objArrI07 = a79.i0(view, 3, null, null);
                g83 g83Var = new g83(null, view, (MyketTextView) objArrI07[2], (MyketTextView) objArrI07[1], (FrameLayout) objArrI07[0]);
                g83Var.y = -1L;
                g83Var.v.setTag(null);
                g83Var.w.setTag(null);
                g83Var.x.setTag(null);
                g83Var.l0(view);
                g83Var.g0();
                return g83Var;
            case 212:
                if (!"layout/holder_screenshot_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_screenshot is invalid. Received: "));
                }
                Object[] objArrI08 = a79.i0(view, 3, null, i83.y);
                i83 i83Var = new i83(null, view, (FrameLayout) objArrI08[2], (ScreenshotView) objArrI08[1]);
                i83Var.x = -1L;
                ((RelativeLayout) objArrI08[0]).setTag(null);
                i83Var.l0(view);
                i83Var.g0();
                return i83Var;
            case 213:
                if ("layout-fa/holder_search_app_0".equals(obj)) {
                    return new k83(view);
                }
                if ("layout/holder_search_app_0".equals(obj)) {
                    return new l83(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_search_app is invalid. Received: "));
            case 214:
                if (!"layout/holder_search_tag_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_search_tag is invalid. Received: "));
                }
                Object[] objArrI09 = a79.i0(view, 2, null, m83.x);
                RelativeLayout relativeLayout = (RelativeLayout) objArrI09[0];
                m83 m83Var = new m83(null, view, relativeLayout);
                m83Var.w = -1L;
                ((RelativeLayout) m83Var.v).setTag(null);
                m83Var.l0(view);
                m83Var.g0();
                return m83Var;
            case 215:
                if ("layout-fa/holder_search_term_0".equals(obj)) {
                    return new o83(view);
                }
                if ("layout/holder_search_term_0".equals(obj)) {
                    return new p83(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_search_term is invalid. Received: "));
            case 216:
                if ("layout/holder_select_city_item_0".equals(obj)) {
                    return new r83(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_select_city_item is invalid. Received: "));
            case 217:
                if ("layout/holder_select_city_title_item_0".equals(obj)) {
                    return new s83(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_select_city_title_item is invalid. Received: "));
            case 218:
                if ("layout/holder_selected_list_add_0".equals(obj)) {
                    return new u83(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_selected_list_add is invalid. Received: "));
            case 219:
                if (!"layout/holder_shimmer_application_horizontal_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_shimmer_application_horizontal is invalid. Received: "));
                }
                Object[] objArrI010 = a79.i0(view, 4, null, w83.x);
                w83 w83Var = new w83(null, view, (ConstraintLayout) objArrI010[0]);
                w83Var.w = -1L;
                w83Var.v.setTag(null);
                w83Var.l0(view);
                w83Var.g0();
                return w83Var;
            case 220:
                if (!"layout/holder_shimmer_application_vertical_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_shimmer_application_vertical is invalid. Received: "));
                }
                Object[] objArrI011 = a79.i0(view, 5, null, y83.y);
                AlphaAnimationView alphaAnimationView = (AlphaAnimationView) objArrI011[1];
                y83 y83Var = new y83(null, view, alphaAnimationView, (ConstraintLayout) objArrI011[0]);
                y83Var.x = -1L;
                y83Var.w.setTag(null);
                y83Var.l0(view);
                y83Var.g0();
                return y83Var;
            case 221:
                if (!"layout/holder_shimmer_application_vertical_digested_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_shimmer_application_vertical_digested is invalid. Received: "));
                }
                Object[] objArrI012 = a79.i0(view, 4, null, a93.y);
                AlphaAnimationView alphaAnimationView2 = (AlphaAnimationView) objArrI012[1];
                a93 a93Var = new a93(null, view, alphaAnimationView2, (ConstraintLayout) objArrI012[0]);
                a93Var.x = -1L;
                a93Var.w.setTag(null);
                a93Var.l0(view);
                a93Var.g0();
                return a93Var;
            case 222:
                if (!"layout/holder_shimmer_header_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_shimmer_header is invalid. Received: "));
                }
                l63 l63Var = new l63(null, view, (ConstraintLayout) a79.i0(view, 1, null, null)[0], 1);
                l63Var.w = -1L;
                ((ConstraintLayout) l63Var.x).setTag(null);
                l63Var.l0(view);
                l63Var.g0();
                return l63Var;
            case 223:
                if (!"layout/holder_shimmer_movies_bg_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_shimmer_movies_bg is invalid. Received: "));
                }
                Object[] objArrI013 = a79.i0(view, 2, null, c93.x);
                c93 c93Var = new c93(null, view, (AlphaAnimationView) objArrI013[1]);
                c93Var.w = -1L;
                ((ConstraintLayout) objArrI013[0]).setTag(null);
                c93Var.l0(view);
                c93Var.g0();
                return c93Var;
            case 224:
                if (!"layout/holder_shimmer_review_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_shimmer_review is invalid. Received: "));
                }
                Object[] objArrI014 = a79.i0(view, 6, null, d93.w);
                d93 d93Var = new d93(0, view, null);
                d93Var.v = -1L;
                ((ConstraintLayout) objArrI014[0]).setTag(null);
                d93Var.l0(view);
                d93Var.g0();
                return d93Var;
            case 225:
                if (!"layout/holder_shimmer_single_app_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_shimmer_single_app is invalid. Received: "));
                }
                Object[] objArrI015 = a79.i0(view, 3, e93.y, e93.z);
                v83 v83Var = (v83) objArrI015[1];
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI015[0];
                e93 e93Var = new e93(null, view, v83Var, constraintLayout2);
                e93Var.x = -1L;
                v83 v83Var2 = (v83) e93Var.v;
                if (v83Var2 != null) {
                    v83Var2.q = e93Var;
                }
                ((ConstraintLayout) e93Var.w).setTag(null);
                e93Var.l0(view);
                e93Var.g0();
                return e93Var;
            case 226:
                if (!"layout/holder_small_movie_horizontal_list_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_small_movie_horizontal_list is invalid. Received: "));
                }
                Object[] objArrI016 = a79.i0(view, 6, null, f93.y);
                LinearLayout linearLayout = (LinearLayout) objArrI016[0];
                ConstraintLayout constraintLayout3 = (ConstraintLayout) objArrI016[1];
                f93 f93Var = new f93(null, view, linearLayout, constraintLayout3);
                f93Var.x = -1L;
                f93Var.v.setTag(null);
                f93Var.w.setTag(null);
                f93Var.l0(view);
                f93Var.g0();
                return f93Var;
            case 227:
                if (!"layout/holder_small_shimmer_banners_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_small_shimmer_banners is invalid. Received: "));
                }
                Object[] objArrI017 = a79.i0(view, 4, null, h93.z);
                h93 h93Var = new h93(null, view, (AlphaAnimationView) objArrI017[1], (View) objArrI017[3], (AlphaAnimationView) objArrI017[2]);
                h93Var.y = -1L;
                ((ConstraintLayout) objArrI017[0]).setTag(null);
                h93Var.l0(view);
                h93Var.g0();
                return h93Var;
            case 228:
                if (!"layout/holder_small_shimmer_movies_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_small_shimmer_movies is invalid. Received: "));
                }
                Object[] objArrI018 = a79.i0(view, 4, null, j93.z);
                j93 j93Var = new j93(null, view, (AlphaAnimationView) objArrI018[1], (View) objArrI018[3], (AlphaAnimationView) objArrI018[2]);
                j93Var.y = -1L;
                ((ConstraintLayout) objArrI018[0]).setTag(null);
                j93Var.l0(view);
                j93Var.g0();
                return j93Var;
            case 229:
                if (!"layout/holder_small_shimmer_reels_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_small_shimmer_reels is invalid. Received: "));
                }
                Object[] objArrI019 = a79.i0(view, 3, null, l93.y);
                l93 l93Var = new l93(null, view, (AlphaAnimationView) objArrI019[1], (View) objArrI019[2]);
                l93Var.x = -1L;
                ((LinearLayout) objArrI019[0]).setTag(null);
                l93Var.l0(view);
                l93Var.g0();
                return l93Var;
            case 230:
                if (!"layout/holder_social_app_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_social_app is invalid. Received: "));
                }
                Object[] objArrI020 = a79.i0(view, 6, null, n93.B);
                n93 n93Var = new n93(null, view, (MyketTextView) objArrI020[3], (AppIconView) objArrI020[5], (ImageView) objArrI020[1], (MyketTextView) objArrI020[2], (ImageView) objArrI020[4]);
                n93Var.A = -1L;
                n93Var.v.setTag(null);
                n93Var.x.setTag(null);
                ((ConstraintLayout) objArrI020[0]).setTag(null);
                n93Var.y.setTag(null);
                n93Var.z.setTag(null);
                n93Var.l0(view);
                n93Var.g0();
                return n93Var;
            case 231:
                if (!"layout/holder_social_movie_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_social_movie is invalid. Received: "));
                }
                Object[] objArrI021 = a79.i0(view, 7, null, p93.C);
                p93 p93Var = new p93(null, view, (ScreenshotView) objArrI021[6], (MyketTextView) objArrI021[3], (ImageView) objArrI021[1], (SeriesBackground) objArrI021[5], (MyketTextView) objArrI021[2], (ImageView) objArrI021[4]);
                p93Var.B = -1L;
                p93Var.w.setTag(null);
                p93Var.x.setTag(null);
                ((ConstraintLayout) objArrI021[0]).setTag(null);
                p93Var.z.setTag(null);
                p93Var.A.setTag(null);
                p93Var.l0(view);
                p93Var.g0();
                return p93Var;
            case 232:
                if (!"layout/holder_streamer_movie_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_streamer_movie is invalid. Received: "));
                }
                Object[] objArrI022 = a79.i0(view, 7, null, r93.D);
                r93 r93Var = new r93(null, view, (ConstraintLayout) objArrI022[0], (MyketTextView) objArrI022[2], (ScreenshotView) objArrI022[4], (SeriesBackground) objArrI022[3], (MyketTextView) objArrI022[1], (ProgressBar) objArrI022[6], (MovieWatchProgressBackgroundView) objArrI022[5]);
                r93Var.C = -1L;
                r93Var.v.setTag(null);
                r93Var.w.setTag(null);
                r93Var.z.setTag(null);
                r93Var.l0(view);
                r93Var.g0();
                return r93Var;
            case 233:
                if ("layout/holder_streamer_movie_title_0".equals(obj)) {
                    return new t93(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for holder_streamer_movie_title is invalid. Received: "));
            case 234:
                if (!"layout/holder_streamer_movies_more_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_streamer_movies_more is invalid. Received: "));
                }
                Object[] objArrI023 = a79.i0(view, 2, null, null);
                u93 u93Var = new u93(null, view, (ConstraintLayout) objArrI023[0], (MyketTextView) objArrI023[1]);
                u93Var.x = -1L;
                u93Var.v.setTag(null);
                u93Var.w.setTag(null);
                u93Var.l0(view);
                u93Var.g0();
                return u93Var;
            case 235:
                if (!"layout/holder_subreview_title_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_subreview_title is invalid. Received: "));
                }
                Object[] objArrI024 = a79.i0(view, 2, null, null);
                v93 v93Var = new v93(null, view, (MyketTextView) objArrI024[1]);
                v93Var.w = -1L;
                ((ConstraintLayout) objArrI024[0]).setTag(null);
                v93Var.v.setTag(null);
                v93Var.l0(view);
                v93Var.g0();
                return v93Var;
            case 236:
                if (!"layout/holder_suggest_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_suggest is invalid. Received: "));
                }
                Object[] objArrI025 = a79.i0(view, 4, null, x93.A);
                x93 x93Var = new x93(null, view, (ConstraintLayout) objArrI025[0], (AvatarImageView) objArrI025[2], (MyketTextView) objArrI025[1], (SmallEmptyMediumTextOvalButton) objArrI025[3]);
                x93Var.z = -1L;
                x93Var.v.setTag(null);
                x93Var.x.setTag(null);
                x93Var.l0(view);
                x93Var.g0();
                return x93Var;
            case 237:
                if (!"layout/holder_theme_style_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_theme_style is invalid. Received: "));
                }
                Object[] objArrI026 = a79.i0(view, 3, null, z93.z);
                z93 z93Var = new z93(null, view, (AppCompatImageView) objArrI026[2], (View) objArrI026[1], (ConstraintLayout) objArrI026[0]);
                z93Var.y = -1L;
                z93Var.x.setTag(null);
                z93Var.l0(view);
                z93Var.g0();
                return z93Var;
            case 238:
                if ("layout-w960dp/holder_user_profile_action_0".equals(obj)) {
                    Object[] objArrI027 = a79.i0(view, 3, null, ca3.y);
                    ca3 ca3Var = new ca3(null, view, (SmallEmptyMediumTextOvalButton) objArrI027[2], (RelationView) objArrI027[1]);
                    ca3Var.x = -1L;
                    ((ConstraintLayout) objArrI027[0]).setTag(null);
                    ca3Var.l0(view);
                    ca3Var.g0();
                    return ca3Var;
                }
                if (!"layout/holder_user_profile_action_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_user_profile_action is invalid. Received: "));
                }
                Object[] objArrI028 = a79.i0(view, 3, null, ba3.y);
                ba3 ba3Var = new ba3(null, view, (SmallEmptyMediumTextOvalButton) objArrI028[2], (RelationView) objArrI028[1]);
                ba3Var.x = -1L;
                ((ConstraintLayout) objArrI028[0]).setTag(null);
                ba3Var.l0(view);
                ba3Var.g0();
                return ba3Var;
            case 239:
                if (!"layout/holder_users_empty_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_users_empty_view is invalid. Received: "));
                }
                Object[] objArrI029 = a79.i0(view, 6, null, ea3.A);
                BigFillOvalButton bigFillOvalButton = (BigFillOvalButton) objArrI029[5];
                LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrI029[4];
                ea3 ea3Var = new ea3(null, view, bigFillOvalButton, lottieAnimationView, (MyketTextView) objArrI029[2], (MyketTextView) objArrI029[1]);
                ea3Var.z = -1L;
                ((FrameLayout) objArrI029[0]).setTag(null);
                ea3Var.x.setTag(null);
                ea3Var.y.setTag(null);
                ea3Var.l0(view);
                ea3Var.g0();
                return ea3Var;
            case 240:
                if (!"layout/holder_video_shot_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_video_shot is invalid. Received: "));
                }
                fa3 fa3Var = new fa3(null, view, (MyketVideoView) a79.i0(view, 1, null, null)[0]);
                fa3Var.w = -1L;
                fa3Var.v.setTag(null);
                fa3Var.l0(view);
                fa3Var.g0();
                return fa3Var;
            case 241:
                if (!"layout/holder_welcome_birthday_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_welcome_birthday is invalid. Received: "));
                }
                Object[] objArrI030 = a79.i0(view, 3, null, ha3.y);
                ha3 ha3Var = new ha3(null, view, (BirthdayPicker) objArrI030[2], (MyketTextView) objArrI030[1]);
                ha3Var.x = -1L;
                ((ConstraintLayout) objArrI030[0]).setTag(null);
                ha3Var.w.setTag(null);
                ha3Var.l0(view);
                ha3Var.g0();
                return ha3Var;
            case 242:
                if (!"layout/holder_welcome_gender_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_welcome_gender is invalid. Received: "));
                }
                Object[] objArrI031 = a79.i0(view, 8, null, ja3.D);
                ja3 ja3Var = new ja3(null, view, (CardView) objArrI031[6], (ImageView) objArrI031[7], (MyketTextView) objArrI031[3], (CardView) objArrI031[4], (ImageView) objArrI031[5], (MyketTextView) objArrI031[2], (MyketTextView) objArrI031[1]);
                ja3Var.C = -1L;
                ja3Var.x.setTag(null);
                ja3Var.A.setTag(null);
                ((ConstraintLayout) objArrI031[0]).setTag(null);
                ja3Var.B.setTag(null);
                ja3Var.l0(view);
                ja3Var.g0();
                return ja3Var;
            case 243:
                if (!"layout/holder_welcome_image_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_welcome_image is invalid. Received: "));
                }
                Object[] objArrI032 = a79.i0(view, 5, null, la3.A);
                la3 la3Var = new la3(null, view, (LoadingView) objArrI032[4], (ImageView) objArrI032[3], (MyketTextView) objArrI032[1], (ImageView) objArrI032[2]);
                la3Var.z = -1L;
                ((ConstraintLayout) objArrI032[0]).setTag(null);
                la3Var.x.setTag(null);
                la3Var.l0(view);
                la3Var.g0();
                return la3Var;
            case 244:
                if (!"layout/holder_welcome_name_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_welcome_name is invalid. Received: "));
                }
                Object[] objArrI033 = a79.i0(view, 5, null, na3.A);
                na3 na3Var = new na3(null, view, (MyketTextView) objArrI033[3], (MyketInputLayout) objArrI033[4], (MyketTextView) objArrI033[1], (MyketEditText) objArrI033[2]);
                na3Var.z = -1L;
                na3Var.v.setTag(null);
                ((ConstraintLayout) objArrI033[0]).setTag(null);
                na3Var.x.setTag(null);
                na3Var.y.setTag(null);
                na3Var.l0(view);
                na3Var.g0();
                return na3Var;
            case 245:
                if (!"layout/holder_whats_new_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for holder_whats_new is invalid. Received: "));
                }
                Object[] objArrI034 = a79.i0(view, 2, pa3.x, null);
                pa3 pa3Var = new pa3(null, view, (c23) objArrI034[1]);
                pa3Var.w = -1L;
                c23 c23Var = pa3Var.v;
                if (c23Var != null) {
                    c23Var.q = pa3Var;
                }
                ((FrameLayout) objArrI034[0]).setTag(null);
                pa3Var.l0(view);
                pa3Var.g0();
                return pa3Var;
            case 246:
                if ("layout/home_banner_0".equals(obj)) {
                    Object[] objArrI035 = a79.i0(view, 3, null, gb3.z);
                    gb3 gb3Var = new gb3(null, view, (ImageView) objArrI035[2], (CardView) objArrI035[1], (FrameLayout) objArrI035[0]);
                    gb3Var.y = -1L;
                    gb3Var.w.setTag(null);
                    gb3Var.x.setTag(null);
                    gb3Var.l0(view);
                    gb3Var.g0();
                    return gb3Var;
                }
                if (!"layout-w960dp/home_banner_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for home_banner is invalid. Received: "));
                }
                Object[] objArrI036 = a79.i0(view, 3, null, hb3.z);
                hb3 hb3Var = new hb3(null, view, (ImageView) objArrI036[2], (CardView) objArrI036[1], (FrameLayout) objArrI036[0]);
                hb3Var.y = -1L;
                hb3Var.x.setTag(null);
                hb3Var.l0(view);
                hb3Var.g0();
                return hb3Var;
            case 247:
                if ("layout-fa/home_more_title_view_0".equals(obj)) {
                    return new vb3(view);
                }
                if ("layout/home_more_title_view_0".equals(obj)) {
                    return new wb3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for home_more_title_view is invalid. Received: "));
            case 248:
                if (!"layout/home_video_digested_row_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for home_video_digested_row is invalid. Received: "));
                }
                Object[] objArrI037 = a79.i0(view, 3, ec3.z, ec3.A);
                ec3 ec3Var = new ec3(null, view, (d95) objArrI037[1], (LinearLayout) objArrI037[0], (MyketVideoView) objArrI037[2]);
                ec3Var.y = -1L;
                d95 d95Var = ec3Var.v;
                if (d95Var != null) {
                    d95Var.q = ec3Var;
                }
                ec3Var.w.setTag(null);
                ec3Var.l0(view);
                ec3Var.g0();
                return ec3Var;
            case 249:
                if (!"layout/home_video_row_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for home_video_row is invalid. Received: "));
                }
                Object[] objArrI038 = a79.i0(view, 3, kc3.z, kc3.A);
                kc3 kc3Var = new kc3(null, view, (b95) objArrI038[1], (LinearLayout) objArrI038[0], (MyketVideoView) objArrI038[2]);
                kc3Var.y = -1L;
                b95 b95Var = kc3Var.v;
                if (b95Var != null) {
                    b95Var.q = kc3Var;
                }
                kc3Var.w.setTag(null);
                kc3Var.l0(view);
                kc3Var.g0();
                return kc3Var;
            case 250:
                if (!"layout/ibex_controller_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for ibex_controller is invalid. Received: "));
                }
                Object[] objArrI039 = a79.i0(view, 8, null, yg3.E);
                yg3 yg3Var = new yg3(null, view, (ImageView) objArrI039[1], (ConstraintLayout) objArrI039[0], (DefaultTimeBar) objArrI039[7], (ImageView) objArrI039[2], (ImageView) objArrI039[4], (ImageView) objArrI039[3], (MyketTextView) objArrI039[5], (MyketTextView) objArrI039[6]);
                yg3Var.D = -1L;
                yg3Var.w.setTag(null);
                yg3Var.l0(view);
                yg3Var.g0();
                return yg3Var;
            default:
                return null;
        }
    }

    public static a79 i(int i, View view, Object obj) {
        switch (i) {
            case 251:
                if ("layout/ibex_fragment_0".equals(obj)) {
                    return new gh3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for ibex_fragment is invalid. Received: "));
            case 252:
                if ("layout/in_app_update_dialog_0".equals(obj)) {
                    return new al3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for in_app_update_dialog is invalid. Received: "));
            case 253:
                if ("layout/inapp_update_appbar_0".equals(obj)) {
                    return new hl3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for inapp_update_appbar is invalid. Received: "));
            case 254:
                if ("layout/inbox_header_holder_0".equals(obj)) {
                    return new ll3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for inbox_header_holder is invalid. Received: "));
            case 255:
                if ("layout/inbox_row_0".equals(obj)) {
                    return new yl3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for inbox_row is invalid. Received: "));
            case 256:
                if ("layout/include_all_reviews_0".equals(obj)) {
                    return new cm3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for include_all_reviews is invalid. Received: "));
            case 257:
                if ("layout/include_more_description_0".equals(obj)) {
                    return new em3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for include_more_description is invalid. Received: "));
            case 258:
                if ("layout-fa/install_snackbar_0".equals(obj)) {
                    return new lp3(0, view);
                }
                if ("layout/install_snackbar_0".equals(obj)) {
                    return new lp3(1, view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for install_snackbar is invalid. Received: "));
            case 259:
                if ("layout/kids_mode_deactive_dialog_0".equals(obj)) {
                    return new kz3(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for kids_mode_deactive_dialog is invalid. Received: "));
            case 260:
                if ("layout/launch_0".equals(obj)) {
                    return new g04(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for launch is invalid. Received: "));
            case 261:
                if ("layout/layout_date_picker_0".equals(obj)) {
                    return new x04(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for layout_date_picker is invalid. Received: "));
            case 262:
                if ("layout-w960dp/layout_step_0".equals(obj)) {
                    return new z14(view);
                }
                if ("layout/layout_step_0".equals(obj)) {
                    return new y14(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for layout_step is invalid. Received: "));
            case 263:
                if ("layout/level_detail_0".equals(obj)) {
                    return new f54(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for level_detail is invalid. Received: "));
            case 264:
                if ("layout/level_info_0".equals(obj)) {
                    return new j54(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for level_info is invalid. Received: "));
            case 265:
                if ("layout/list_application_card_0".equals(obj)) {
                    return new l84(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for list_application_card is invalid. Received: "));
            case 266:
                if ("layout/local_message_box_0".equals(obj)) {
                    return new nc4(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for local_message_box is invalid. Received: "));
            case 267:
                if ("layout/main_app_empty_view_0".equals(obj)) {
                    return new rg4(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for main_app_empty_view is invalid. Received: "));
            case 268:
                if (!"layout/message_box_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for message_box is invalid. Received: "));
                }
                Object[] objArrI0 = a79.i0(view, 5, null, wu4.A);
                wu4 wu4Var = new wu4(null, view, (FrameLayout) objArrI0[1], (ImageView) objArrI0[2], (SmallBoldTextButton) objArrI0[4], (MyketTextView) objArrI0[3]);
                wu4Var.z = -1L;
                ((FrameLayout) objArrI0[0]).setTag(null);
                wu4Var.l0(view);
                wu4Var.g0();
                return wu4Var;
            case 269:
                if ("layout/mini_player_view_0".equals(obj)) {
                    return new xv4(new View[]{view});
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for mini_player_view is invalid. Received: "));
            case 270:
                if (!"layout/miui_dialog_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for miui_dialog_fragment is invalid. Received: "));
                }
                Object[] objArrI02 = a79.i0(view, 5, null, cw4.A);
                MyketTextView myketTextView = (MyketTextView) objArrI02[1];
                DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI02[4];
                LinearLayout linearLayout = (LinearLayout) objArrI02[2];
                cw4 cw4Var = new cw4(null, view, myketTextView, dialogButtonComponent, linearLayout);
                cw4Var.z = -1L;
                cw4Var.v.setTag(null);
                ((FrameLayout) objArrI02[0]).setTag(null);
                cw4Var.l0(view);
                cw4Var.g0();
                return cw4Var;
            case 271:
                if (!"layout/more_title_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for more_title_view is invalid. Received: "));
                }
                Object[] objArrI03 = a79.i0(view, 4, null, hy4.A);
                hy4 hy4Var = new hy4(null, view, (ConstraintLayout) objArrI03[0], (SmallBoldTextButton) objArrI03[3], (MyketTextView) objArrI03[2], (MyketTextView) objArrI03[1]);
                hy4Var.z = -1L;
                hy4Var.v.setTag(null);
                hy4Var.x.setTag(null);
                hy4Var.y.setTag(null);
                hy4Var.l0(view);
                hy4Var.g0();
                return hy4Var;
            case 272:
                if (!"layout/movie_card_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_card is invalid. Received: "));
                }
                Object[] objArrI04 = a79.i0(view, 10, null, h05.F);
                h05 h05Var = new h05(null, view, (FrameLayout) objArrI04[1], (View) objArrI04[9], (MovieLabelView) objArrI04[4], (ScreenshotView) objArrI04[3], (MyketTextView) objArrI04[8], (SeriesBackground) objArrI04[2], (MyketTextView) objArrI04[7], (ProgressBar) objArrI04[6], (MovieWatchProgressBackgroundView) objArrI04[5]);
                h05Var.E = -1L;
                ((LinearLayout) objArrI04[0]).setTag(null);
                h05Var.l0(view);
                h05Var.g0();
                return h05Var;
            case 273:
                if (!"layout/movie_cast_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_cast is invalid. Received: "));
                }
                Object[] objArrI05 = a79.i0(view, 4, null, m05.z);
                m05 m05Var = new m05(null, view, (FlowLayoutView) objArrI05[3], (ConstraintLayout) objArrI05[1], (MyketTextView) objArrI05[2]);
                m05Var.y = -1L;
                m05Var.w.setTag(null);
                ((FrameLayout) objArrI05[0]).setTag(null);
                m05Var.x.setTag(null);
                m05Var.l0(view);
                m05Var.g0();
                return m05Var;
            case 274:
                if ("layout-fa/movie_description_0".equals(obj)) {
                    return new z05(0, view);
                }
                if ("layout/movie_description_0".equals(obj)) {
                    return new z05(1, view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for movie_description is invalid. Received: "));
            case 275:
                if (!"layout/movie_detail_collapse_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_detail_collapse_view is invalid. Received: "));
                }
                Object[] objArrI06 = a79.i0(view, 6, null, e15.B);
                ImageView imageView = (ImageView) objArrI06[3];
                ImageView imageView2 = (ImageView) objArrI06[4];
                e15 e15Var = new e15(null, view, (View) objArrI06[1], imageView, imageView2, (ImageView) objArrI06[5]);
                e15Var.A = -1L;
                ((ConstraintLayout) objArrI06[0]).setTag(null);
                e15Var.y.setTag(null);
                e15Var.l0(view);
                e15Var.g0();
                return e15Var;
            case 276:
                if ("layout-w720dp/movie_detail_header_view_0".equals(obj)) {
                    Object[] objArrI07 = a79.i0(view, 14, null, m15.J);
                    ImageView imageView3 = (ImageView) objArrI07[13];
                    ImageView imageView4 = (ImageView) objArrI07[5];
                    m15 m15Var = new m15(null, view, imageView3, imageView4, (BigFillOvalButton) objArrI07[9], (FrameLayout) objArrI07[8], (ConstraintLayout) objArrI07[0], (MovieDownloadButton) objArrI07[6], (FlowLayoutView) objArrI07[10], (MyketTextView) objArrI07[1], (MyketTextView) objArrI07[2], (AvatarImageView) objArrI07[3], (View) objArrI07[4], (MyketTextView) objArrI07[12], (FlowLayoutView) objArrI07[11]);
                    m15Var.I = -1L;
                    m15Var.z.setTag(null);
                    m15Var.C.setTag(null);
                    m15Var.D.setTag(null);
                    m15Var.E.setTag(null);
                    m15Var.F.setTag(null);
                    m15Var.l0(view);
                    m15Var.g0();
                    return m15Var;
                }
                if ("layout-w600dp/movie_detail_header_view_0".equals(obj)) {
                    Object[] objArrI08 = a79.i0(view, 14, null, l15.J);
                    ImageView imageView5 = (ImageView) objArrI08[13];
                    ImageView imageView6 = (ImageView) objArrI08[5];
                    l15 l15Var = new l15(null, view, imageView5, imageView6, (BigFillOvalButton) objArrI08[9], (FrameLayout) objArrI08[8], (ConstraintLayout) objArrI08[0], (MovieDownloadButton) objArrI08[6], (FlowLayoutView) objArrI08[10], (MyketTextView) objArrI08[1], (MyketTextView) objArrI08[2], (AvatarImageView) objArrI08[3], (View) objArrI08[4], (MyketTextView) objArrI08[12], (FlowLayoutView) objArrI08[11]);
                    l15Var.I = -1L;
                    l15Var.z.setTag(null);
                    l15Var.C.setTag(null);
                    l15Var.D.setTag(null);
                    l15Var.E.setTag(null);
                    l15Var.F.setTag(null);
                    l15Var.l0(view);
                    l15Var.g0();
                    return l15Var;
                }
                if (!"layout/movie_detail_header_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_detail_header_view is invalid. Received: "));
                }
                Object[] objArrI09 = a79.i0(view, 14, null, k15.J);
                ImageView imageView7 = (ImageView) objArrI09[13];
                ImageView imageView8 = (ImageView) objArrI09[5];
                k15 k15Var = new k15(null, view, imageView7, imageView8, (BigFillOvalButton) objArrI09[9], (FrameLayout) objArrI09[8], (ConstraintLayout) objArrI09[0], (MovieDownloadButton) objArrI09[6], (FlowLayoutView) objArrI09[10], (MyketTextView) objArrI09[1], (MyketTextView) objArrI09[2], (AvatarImageView) objArrI09[3], (View) objArrI09[4], (MyketTextView) objArrI09[12], (FlowLayoutView) objArrI09[11]);
                k15Var.I = -1L;
                k15Var.z.setTag(null);
                k15Var.C.setTag(null);
                k15Var.D.setTag(null);
                k15Var.E.setTag(null);
                k15Var.F.setTag(null);
                k15Var.l0(view);
                k15Var.g0();
                return k15Var;
            case 277:
                if ("layout/movie_detail_tab_view_0".equals(obj)) {
                    Object[] objArrI010 = a79.i0(view, 5, null, a25.C);
                    View view2 = (View) objArrI010[2];
                    ImageView imageView9 = (ImageView) objArrI010[4];
                    a25 a25Var = new a25(null, view, null, view2, null, imageView9, (MovieTabView) objArrI010[1]);
                    a25Var.B = -1L;
                    ((ConstraintLayout) objArrI010[0]).setTag(null);
                    a25Var.z.setTag(null);
                    a25Var.l0(view);
                    a25Var.g0();
                    return a25Var;
                }
                if ("layout-w720dp/movie_detail_tab_view_0".equals(obj)) {
                    Object[] objArrI011 = a79.i0(view, 5, null, c25.C);
                    ImageView imageView10 = (ImageView) objArrI011[2];
                    BigMovieOvalButton bigMovieOvalButton = (BigMovieOvalButton) objArrI011[3];
                    c25 c25Var = new c25(null, view, imageView10, null, bigMovieOvalButton, null, (MovieTabView) objArrI011[1]);
                    c25Var.B = -1L;
                    ((ConstraintLayout) objArrI011[0]).setTag(null);
                    c25Var.z.setTag(null);
                    c25Var.l0(view);
                    c25Var.g0();
                    return c25Var;
                }
                if (!"layout-w600dp/movie_detail_tab_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_detail_tab_view is invalid. Received: "));
                }
                Object[] objArrI012 = a79.i0(view, 5, null, b25.C);
                View view3 = (View) objArrI012[2];
                ImageView imageView11 = (ImageView) objArrI012[4];
                b25 b25Var = new b25(null, view, null, view3, null, imageView11, (MovieTabView) objArrI012[1]);
                b25Var.B = -1L;
                ((ConstraintLayout) objArrI012[0]).setTag(null);
                b25Var.z.setTag(null);
                b25Var.l0(view);
                b25Var.g0();
                return b25Var;
            case 278:
                if ("layout/movie_detail_toolbar_view_0".equals(obj)) {
                    Object[] objArrI013 = a79.i0(view, 8, null, f25.E);
                    f25 f25Var = new f25(null, view, (ImageView) objArrI013[3], (SmallFillOvalButton) objArrI013[5], (ImageView) objArrI013[7], (ImageView) objArrI013[4], (ImageView) objArrI013[6], (MyketTextView) objArrI013[2], (MyketTextView) objArrI013[1]);
                    f25Var.D = -1L;
                    ((ConstraintLayout) objArrI013[0]).setTag(null);
                    f25Var.A.setTag(null);
                    f25Var.B.setTag(null);
                    f25Var.l0(view);
                    f25Var.g0();
                    return f25Var;
                }
                if (!"layout-fa/movie_detail_toolbar_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_detail_toolbar_view is invalid. Received: "));
                }
                Object[] objArrI014 = a79.i0(view, 8, null, e25.E);
                e25 e25Var = new e25(null, view, (ImageView) objArrI014[3], (SmallFillOvalButton) objArrI014[5], (ImageView) objArrI014[7], (ImageView) objArrI014[4], (ImageView) objArrI014[6], (MyketTextView) objArrI014[2], (MyketTextView) objArrI014[1]);
                e25Var.D = -1L;
                ((ConstraintLayout) objArrI014[0]).setTag(null);
                e25Var.A.setTag(null);
                e25Var.B.setTag(null);
                e25Var.l0(view);
                e25Var.g0();
                return e25Var;
            case 279:
                if (!"layout/movie_review_empty_viewholder_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_review_empty_viewholder is invalid. Received: "));
                }
                Object[] objArrI015 = a79.i0(view, 3, null, h55.y);
                h55 h55Var = new h55(null, view, (ImageView) objArrI015[2], (MyketTextView) objArrI015[1]);
                h55Var.x = -1L;
                ((ConstraintLayout) objArrI015[0]).setTag(null);
                h55Var.v.setTag(null);
                h55Var.l0(view);
                h55Var.g0();
                return h55Var;
            case 280:
                if ("layout/movie_review_info_0".equals(obj)) {
                    Object[] objArrI016 = a79.i0(view, 4, null, m55.A);
                    m55 m55Var = new m55(null, view, (FrameLayout) objArrI016[0], (MyketTextView) objArrI016[3], (MyketTextView) objArrI016[2], (MyketTextView) objArrI016[1]);
                    m55Var.z = -1L;
                    m55Var.v.setTag(null);
                    m55Var.x.setTag(null);
                    m55Var.y.setTag(null);
                    m55Var.l0(view);
                    m55Var.g0();
                    return m55Var;
                }
                if (!"layout-fa/movie_review_info_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_review_info is invalid. Received: "));
                }
                Object[] objArrI017 = a79.i0(view, 4, null, l55.A);
                l55 l55Var = new l55(null, view, (FrameLayout) objArrI017[0], (MyketTextView) objArrI017[3], (MyketTextView) objArrI017[2], (MyketTextView) objArrI017[1]);
                l55Var.z = -1L;
                l55Var.v.setTag(null);
                l55Var.x.setTag(null);
                l55Var.y.setTag(null);
                l55Var.l0(view);
                l55Var.g0();
                return l55Var;
            case 281:
                if (!"layout/movie_review_title_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_review_title is invalid. Received: "));
                }
                Object[] objArrI018 = a79.i0(view, 3, null, t55.z);
                t55 t55Var = new t55(null, view, (ConstraintLayout) objArrI018[0], (MyketTextView) objArrI018[1], (SmallBoldTextButton) objArrI018[2]);
                t55Var.y = -1L;
                t55Var.v.setTag(null);
                t55Var.x.setTag(null);
                t55Var.l0(view);
                t55Var.g0();
                return t55Var;
            case 282:
                if (!"layout/movie_search_card_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_search_card is invalid. Received: "));
                }
                Object[] objArrI019 = a79.i0(view, 12, null, h65.B);
                ConstraintLayout constraintLayout = (ConstraintLayout) objArrI019[1];
                FrameLayout frameLayout = (FrameLayout) objArrI019[0];
                MyketTextView myketTextView2 = (MyketTextView) objArrI019[4];
                MyketTextView myketTextView3 = (MyketTextView) objArrI019[3];
                MyketTextView myketTextView4 = (MyketTextView) objArrI019[2];
                h65 h65Var = new h65(null, view, constraintLayout, frameLayout, myketTextView2, myketTextView3, myketTextView4);
                h65Var.A = -1L;
                h65Var.v.setTag(null);
                h65Var.w.setTag(null);
                h65Var.x.setTag(null);
                h65Var.y.setTag(null);
                h65Var.z.setTag(null);
                h65Var.l0(view);
                h65Var.g0();
                return h65Var;
            case 283:
                if (!"layout/movie_search_card_exact_match_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_search_card_exact_match is invalid. Received: "));
                }
                Object[] objArrI020 = a79.i0(view, 13, null, j65.B);
                FrameLayout frameLayout2 = (FrameLayout) objArrI020[0];
                FlowLayoutView flowLayoutView = (FlowLayoutView) objArrI020[10];
                MyketTextView myketTextView5 = (MyketTextView) objArrI020[3];
                MyketTextView myketTextView6 = (MyketTextView) objArrI020[2];
                MyketTextView myketTextView7 = (MyketTextView) objArrI020[1];
                j65 j65Var = new j65(null, view, frameLayout2, flowLayoutView, myketTextView5, myketTextView6, myketTextView7);
                j65Var.A = -1L;
                j65Var.v.setTag(null);
                j65Var.x.setTag(null);
                j65Var.y.setTag(null);
                j65Var.z.setTag(null);
                j65Var.l0(view);
                j65Var.g0();
                return j65Var;
            case 284:
                if (!"layout/movie_season_fixed_title_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_season_fixed_title is invalid. Received: "));
                }
                Object[] objArrI021 = a79.i0(view, 5, null, s65.B);
                s65 s65Var = new s65(null, view, (View) objArrI021[1], (MyketTextView) objArrI021[2], (View) objArrI021[4], (MyketTextView) objArrI021[3]);
                s65Var.A = -1L;
                s65Var.v.setTag(null);
                s65Var.w.setTag(null);
                ((ConstraintLayout) objArrI021[0]).setTag(null);
                s65Var.y.setTag(null);
                s65Var.l0(view);
                s65Var.g0();
                return s65Var;
            case 285:
                if (!"layout/movie_season_title_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_season_title is invalid. Received: "));
                }
                Object[] objArrI022 = a79.i0(view, 3, null, x65.z);
                x65 x65Var = new x65(null, view, (View) objArrI022[2], (ConstraintLayout) objArrI022[0], (MyketTextView) objArrI022[1]);
                x65Var.y = -1L;
                x65Var.w.setTag(null);
                x65Var.x.setTag(null);
                x65Var.l0(view);
                x65Var.g0();
                return x65Var;
            case 286:
                if (!"layout/movie_submit_review_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_submit_review_item is invalid. Received: "));
                }
                Object[] objArrI023 = a79.i0(view, 19, null, e75.Q);
                e75 e75Var = new e75(null, view, (ImageView) objArrI023[11], (MyketTextView) objArrI023[3], (MyketTextView) objArrI023[2], (MyketTextView) objArrI023[4], (MyketImageButton) objArrI023[14], (MyketTextView) objArrI023[8], (BuzzProgressImageView) objArrI023[16], (SmallRegularTextButton) objArrI023[6], (ConstraintLayout) objArrI023[0], (MyketImageButton) objArrI023[13], (MyketTextView) objArrI023[7], (Group) objArrI023[17], (MyketTextView) objArrI023[5], (BuzzProgressImageView) objArrI023[15], (MyketTextView) objArrI023[12], (MyketTextView) objArrI023[1], (View) objArrI023[10], (SmallFillOvalButton) objArrI023[18], (MyketEditText) objArrI023[9]);
                e75Var.P = -1L;
                e75Var.w.setTag(null);
                e75Var.x.setTag(null);
                e75Var.y.setTag(null);
                e75Var.A.setTag(null);
                e75Var.C.setTag(null);
                e75Var.D.setTag(null);
                e75Var.F.setTag(null);
                e75Var.H.setTag(null);
                e75Var.K.setTag(null);
                e75Var.N.setTag(null);
                e75Var.l0(view);
                e75Var.g0();
                return e75Var;
            case 287:
                if (!"layout/movie_tag_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_tag_view is invalid. Received: "));
                }
                Object[] objArrI024 = a79.i0(view, 4, null, v75.B);
                v75 v75Var = new v75(null, view, (LinearLayout) objArrI024[0], (ImageView) objArrI024[2], (MyketTextView) objArrI024[3], (FrameLayout) objArrI024[1]);
                v75Var.A = -1L;
                v75Var.v.setTag(null);
                v75Var.l0(view);
                v75Var.g0();
                return v75Var;
            case 288:
                if (!"layout/movie_text_tag_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for movie_text_tag_view is invalid. Received: "));
                }
                Object[] objArrI025 = a79.i0(view, 3, null, null);
                x75 x75Var = new x75(null, view, (LinearLayout) objArrI025[0], (MyketTextView) objArrI025[1], (MyketTextView) objArrI025[2]);
                x75Var.y = -1L;
                x75Var.v.setTag(null);
                x75Var.w.setTag(null);
                x75Var.x.setTag(null);
                x75Var.l0(view);
                x75Var.g0();
                return x75Var;
            case 289:
                if (!"layout/multi_app_card_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for multi_app_card is invalid. Received: "));
                }
                Object[] objArrI026 = a79.i0(view, 9, null, c95.E);
                MyketAdInfoView myketAdInfoView = (MyketAdInfoView) objArrI026[6];
                MyketTextView myketTextView8 = (MyketTextView) objArrI026[7];
                AppIconView appIconView = (AppIconView) objArrI026[5];
                FrameLayout frameLayout3 = (FrameLayout) objArrI026[1];
                MyketTextView myketTextView9 = (MyketTextView) objArrI026[2];
                c95 c95Var = new c95(null, view, myketAdInfoView, myketTextView8, appIconView, frameLayout3, myketTextView9, (FastDownloadView) objArrI026[8], (View) objArrI026[3]);
                c95Var.D = -1L;
                c95Var.y.setTag(null);
                c95Var.z.setTag(null);
                ((RelativeLayout) objArrI026[0]).setTag(null);
                c95Var.l0(view);
                c95Var.g0();
                return c95Var;
            case 290:
                if (!"layout/multi_app_card_digested_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for multi_app_card_digested is invalid. Received: "));
                }
                Object[] objArrI027 = a79.i0(view, 8, null, e95.D);
                MyketAdInfoView myketAdInfoView2 = (MyketAdInfoView) objArrI027[6];
                MyketTextView myketTextView10 = (MyketTextView) objArrI027[7];
                AppIconView appIconView2 = (AppIconView) objArrI027[5];
                FrameLayout frameLayout4 = (FrameLayout) objArrI027[1];
                MyketTextView myketTextView11 = (MyketTextView) objArrI027[2];
                e95 e95Var = new e95(null, view, myketAdInfoView2, myketTextView10, appIconView2, frameLayout4, myketTextView11, (View) objArrI027[3]);
                e95Var.C = -1L;
                e95Var.y.setTag(null);
                e95Var.z.setTag(null);
                ((RelativeLayout) objArrI027[0]).setTag(null);
                e95Var.l0(view);
                e95Var.g0();
                return e95Var;
            case 291:
                if (!"layout/multiselect_content_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for multiselect_content_fragment is invalid. Received: "));
                }
                Object[] objArrI028 = a79.i0(view, 2, null, ma5.y);
                ma5 ma5Var = new ma5(null, view, (FrameLayout) objArrI028[1]);
                ma5Var.x = -1L;
                ((FrameLayout) objArrI028[0]).setTag(null);
                ma5Var.l0(view);
                ma5Var.g0();
                return ma5Var;
            case 292:
                if ("layout/multiselect_title_view_0".equals(obj)) {
                    return new na5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for multiselect_title_view is invalid. Received: "));
            case 293:
                if (!"layout/my_account_header_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for my_account_header is invalid. Received: "));
                }
                Object[] objArrI029 = a79.i0(view, 6, null, ic5.C);
                ic5 ic5Var = new ic5(null, view, (ImageView) objArrI029[1], (ConstraintLayout) objArrI029[3], (LoadingView) objArrI029[5], (ImageView) objArrI029[4], (FrameLayout) objArrI029[2], (ConstraintLayout) objArrI029[0]);
                ic5Var.B = -1L;
                ic5Var.v.setTag(null);
                ic5Var.z.setTag(null);
                ic5Var.A.setTag(null);
                ic5Var.l0(view);
                ic5Var.g0();
                return ic5Var;
            case 294:
                if (!"layout/my_account_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for my_account_item is invalid. Received: "));
                }
                Object[] objArrI030 = a79.i0(view, 4, null, mc5.A);
                mc5 mc5Var = new mc5(null, view, (FrameLayout) objArrI030[0], (ImageView) objArrI030[3], (MyketTextView) objArrI030[1], (MyketTextView) objArrI030[2]);
                mc5Var.z = -1L;
                mc5Var.v.setTag(null);
                mc5Var.x.setTag(null);
                mc5Var.l0(view);
                mc5Var.g0();
                return mc5Var;
            case 295:
                if (!"layout/my_market_about_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for my_market_about is invalid. Received: "));
                }
                Object[] objArrI031 = a79.i0(view, 6, null, yc5.B);
                MyketTextView myketTextView12 = (MyketTextView) objArrI031[1];
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI031[0];
                MyketTextView myketTextView13 = (MyketTextView) objArrI031[2];
                MyketTextView myketTextView14 = (MyketTextView) objArrI031[3];
                yc5 yc5Var = new yc5(null, view, myketTextView12, constraintLayout2, myketTextView13, myketTextView14, (ImageView) objArrI031[5]);
                yc5Var.A = -1L;
                yc5Var.v.setTag(null);
                yc5Var.w.setTag(null);
                yc5Var.x.setTag(null);
                yc5Var.y.setTag(null);
                yc5Var.l0(view);
                yc5Var.g0();
                return yc5Var;
            case 296:
                if (!"layout/my_market_animation_row_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for my_market_animation_row is invalid. Received: "));
                }
                Object[] objArrI032 = a79.i0(view, 5, null, bd5.z);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrI032[3];
                ConstraintLayout constraintLayout3 = (ConstraintLayout) objArrI032[0];
                bd5 bd5Var = new bd5(null, view, constraintLayout3, lottieAnimationView, (MyketTextView) objArrI032[1]);
                bd5Var.y = -1L;
                bd5Var.w.setTag(null);
                bd5Var.x.setTag(null);
                bd5Var.l0(view);
                bd5Var.g0();
                return bd5Var;
            case 297:
                if ("layout/my_market_balloon_row_0".equals(obj)) {
                    return new cd5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for my_market_balloon_row is invalid. Received: "));
            case 298:
                if (!"layout/my_market_header_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for my_market_header is invalid. Received: "));
                }
                Object[] objArrI033 = a79.i0(view, 6, null, fd5.B);
                fd5 fd5Var = new fd5(null, view, (SmallBoldTextButton) objArrI033[5], (ImageView) objArrI033[3], (View) objArrI033[4], (ConstraintLayout) objArrI033[2], (MyketTextView) objArrI033[1]);
                fd5Var.A = -1L;
                ((FrameLayout) objArrI033[0]).setTag(null);
                fd5Var.z.setTag(null);
                fd5Var.l0(view);
                fd5Var.g0();
                return fd5Var;
            case 299:
                if (!"layout/my_market_row_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for my_market_row is invalid. Received: "));
                }
                Object[] objArrI034 = a79.i0(view, 4, null, pd5.x);
                ConstraintLayout constraintLayout4 = (ConstraintLayout) objArrI034[0];
                pd5 pd5Var = new pd5(null, view, constraintLayout4);
                pd5Var.w = -1L;
                ((ConstraintLayout) pd5Var.v).setTag(null);
                pd5Var.l0(view);
                pd5Var.g0();
                return pd5Var;
            case 300:
                if (!"layout/my_market_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for my_market_view is invalid. Received: "));
                }
                Object[] objArrI035 = a79.i0(view, 2, null, rd5.z);
                rd5 rd5Var = new rd5(null, view, (ImageView) objArrI035[1], (ConstraintLayout) objArrI035[0]);
                rd5Var.y = -1L;
                rd5Var.w.setTag(null);
                rd5Var.l0(view);
                rd5Var.g0();
                return rd5Var;
            default:
                return null;
        }
    }

    public static a79 j(int i, View view, Object obj) {
        switch (i) {
            case 301:
                if ("layout/my_reviews_list_0".equals(obj)) {
                    return new ae5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for my_reviews_list is invalid. Received: "));
            case 302:
                if ("layout-w960dp/myket_navigation_menu_0".equals(obj)) {
                    return new xe5(view);
                }
                if ("layout/myket_navigation_menu_0".equals(obj)) {
                    return new we5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for myket_navigation_menu is invalid. Received: "));
            case 303:
                if ("layout/myket_recent_download_view_0".equals(obj)) {
                    return new df5(new View[]{view});
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for myket_recent_download_view is invalid. Received: "));
            case 304:
                if ("layout/myket_social_module_0".equals(obj)) {
                    return new jf5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for myket_social_module is invalid. Received: "));
            case 305:
                if ("layout/myket_star_0".equals(obj)) {
                    return new lf5(new View[]{view});
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for myket_star is invalid. Received: "));
            case 306:
                if ("layout/myket_update_dialog_0".equals(obj)) {
                    return new ag5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for myket_update_dialog is invalid. Received: "));
            case 307:
                if ("layout/myket_video_view_0".equals(obj)) {
                    return new lg5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for myket_video_view is invalid. Received: "));
            case 308:
                if ("layout/mymarket_horizontal_item_0".equals(obj)) {
                    return new tg5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for mymarket_horizontal_item is invalid. Received: "));
            case 309:
                if ("layout/nav_content_0".equals(obj)) {
                    return new ii5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for nav_content is invalid. Received: "));
            case 310:
                if ("layout/nearby_permission_alert_dialog_0".equals(obj)) {
                    return new nl5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for nearby_permission_alert_dialog is invalid. Received: "));
            case 311:
                if ("layout/need_permission_to_continue_0".equals(obj)) {
                    return new tl5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for need_permission_to_continue is invalid. Received: "));
            case 312:
                if ("layout/new_ver_note_0".equals(obj)) {
                    return new ln5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for new_ver_note is invalid. Received: "));
            case 313:
                if ("layout/not_suitable_for_kids_0".equals(obj)) {
                    return new so5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for not_suitable_for_kids is invalid. Received: "));
            case 314:
                if ("layout/notification_badge_0".equals(obj)) {
                    return new yo5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for notification_badge is invalid. Received: "));
            case 315:
                if ("layout/own_profile_toolbar_view_0".equals(obj)) {
                    return new by5(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for own_profile_toolbar_view is invalid. Received: "));
            case 316:
                if (!"layout/paging_footer_row_horizontal_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for paging_footer_row_horizontal is invalid. Received: "));
                }
                Object[] objArrI0 = a79.i0(view, 2, null, j06.z);
                j06 j06Var = new j06(null, view, (ConstraintLayout) objArrI0[0], (LoadingView) objArrI0[1]);
                j06Var.y = -1L;
                j06Var.v.setTag(null);
                j06Var.l0(view);
                j06Var.g0();
                return j06Var;
            case 317:
                if (!"layout/payment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for payment is invalid. Received: "));
                }
                Object[] objArrI02 = a79.i0(view, 11, null, c46.F);
                ImageView imageView = (ImageView) objArrI02[8];
                FrameLayout frameLayout = (FrameLayout) objArrI02[7];
                c46 c46Var = new c46(null, view, imageView, frameLayout, (ImageView) objArrI02[4], (ConstraintLayout) objArrI02[0], (TryAgainView) objArrI02[10], (MyketTextView) objArrI02[2], (View) objArrI02[1], (View) objArrI02[6], (MyketWebView) objArrI02[9]);
                c46Var.E = -1L;
                c46Var.y.setTag(null);
                c46Var.A.setTag(null);
                c46Var.B.setTag(null);
                c46Var.l0(view);
                c46Var.g0();
                return c46Var;
            case 318:
                if ("layout-land/payment_dialog_0".equals(obj)) {
                    Object[] objArrI03 = a79.i0(view, 18, null, f46.N);
                    AppIconView appIconView = (AppIconView) objArrI03[13];
                    MyketTextView myketTextView = (MyketTextView) objArrI03[3];
                    DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI03[17];
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArrI03[11];
                    ImageView imageView2 = (ImageView) objArrI03[12];
                    MyketTextView myketTextView2 = (MyketTextView) objArrI03[1];
                    View view2 = (View) objArrI03[5];
                    MyketTextView myketTextView3 = (MyketTextView) objArrI03[6];
                    MyketTextView myketTextView4 = (MyketTextView) objArrI03[4];
                    f46 f46Var = new f46(null, view, view2, (View) objArrI03[2], imageView2, (ImageView) objArrI03[8], (ImageView) objArrI03[9], constraintLayout, (ConstraintLayout) objArrI03[0], (RecyclerView) objArrI03[16], appIconView, dialogButtonComponent, myketTextView, myketTextView2, myketTextView3, myketTextView4, (MyketTextView) objArrI03[7], (PaymentPriceView) objArrI03[14]);
                    f46Var.M = -1L;
                    f46Var.w.setTag(null);
                    f46Var.A.setTag(null);
                    f46Var.B.setTag(null);
                    f46Var.C.setTag(null);
                    f46Var.D.setTag(null);
                    f46Var.E.setTag(null);
                    f46Var.F.setTag(null);
                    f46Var.K.setTag(null);
                    f46Var.l0(view);
                    f46Var.g0();
                    return f46Var;
                }
                if (!"layout/payment_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for payment_dialog is invalid. Received: "));
                }
                Object[] objArrI04 = a79.i0(view, 17, null, e46.N);
                AppIconView appIconView2 = (AppIconView) objArrI04[13];
                MyketTextView myketTextView5 = (MyketTextView) objArrI04[3];
                DialogButtonComponent dialogButtonComponent2 = (DialogButtonComponent) objArrI04[16];
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI04[11];
                ImageView imageView3 = (ImageView) objArrI04[12];
                MyketTextView myketTextView6 = (MyketTextView) objArrI04[1];
                View view3 = (View) objArrI04[5];
                MyketTextView myketTextView7 = (MyketTextView) objArrI04[6];
                MyketTextView myketTextView8 = (MyketTextView) objArrI04[4];
                e46 e46Var = new e46(null, view, view3, (View) objArrI04[2], imageView3, (ImageView) objArrI04[8], (ImageView) objArrI04[9], constraintLayout2, (ConstraintLayout) objArrI04[0], (RecyclerView) objArrI04[15], appIconView2, dialogButtonComponent2, myketTextView5, myketTextView6, myketTextView7, myketTextView8, (MyketTextView) objArrI04[7], (PaymentPriceView) objArrI04[14]);
                e46Var.M = -1L;
                e46Var.w.setTag(null);
                e46Var.A.setTag(null);
                e46Var.B.setTag(null);
                e46Var.C.setTag(null);
                e46Var.D.setTag(null);
                e46Var.E.setTag(null);
                e46Var.F.setTag(null);
                e46Var.K.setTag(null);
                e46Var.l0(view);
                e46Var.g0();
                return e46Var;
            case 319:
                if ("layout/payment_gateway_dialog_0".equals(obj)) {
                    Object[] objArrI05 = a79.i0(view, 16, null, h46.N);
                    AppIconView appIconView3 = (AppIconView) objArrI05[12];
                    MyketTextView myketTextView9 = (MyketTextView) objArrI05[3];
                    DialogButtonComponent dialogButtonComponent3 = (DialogButtonComponent) objArrI05[15];
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) objArrI05[10];
                    ImageView imageView4 = (ImageView) objArrI05[11];
                    MyketTextView myketTextView10 = (MyketTextView) objArrI05[1];
                    MyketTextView myketTextView11 = (MyketTextView) objArrI05[4];
                    View view4 = (View) objArrI05[2];
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) objArrI05[0];
                    h46 h46Var = new h46(null, view, null, view4, imageView4, (ImageView) objArrI05[7], (ImageView) objArrI05[8], constraintLayout3, constraintLayout4, (RecyclerView) objArrI05[14], appIconView3, dialogButtonComponent3, myketTextView9, myketTextView10, myketTextView11, (MyketTextView) objArrI05[5], (MyketTextView) objArrI05[6], (PaymentPriceView) objArrI05[13]);
                    h46Var.M = -1L;
                    h46Var.w.setTag(null);
                    h46Var.A.setTag(null);
                    h46Var.C.setTag(null);
                    h46Var.D.setTag(null);
                    h46Var.E.setTag(null);
                    h46Var.I.setTag(null);
                    h46Var.K.setTag(null);
                    h46Var.l0(view);
                    h46Var.g0();
                    return h46Var;
                }
                if (!"layout-land/payment_gateway_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for payment_gateway_dialog is invalid. Received: "));
                }
                Object[] objArrI06 = a79.i0(view, 16, null, i46.N);
                AppIconView appIconView4 = (AppIconView) objArrI06[12];
                MyketTextView myketTextView12 = (MyketTextView) objArrI06[2];
                DialogButtonComponent dialogButtonComponent4 = (DialogButtonComponent) objArrI06[15];
                ConstraintLayout constraintLayout5 = (ConstraintLayout) objArrI06[10];
                ImageView imageView5 = (ImageView) objArrI06[11];
                MyketTextView myketTextView13 = (MyketTextView) objArrI06[1];
                View view5 = (View) objArrI06[5];
                MyketTextView myketTextView14 = (MyketTextView) objArrI06[3];
                ConstraintLayout constraintLayout6 = (ConstraintLayout) objArrI06[0];
                i46 i46Var = new i46(null, view, view5, null, imageView5, (ImageView) objArrI06[8], (ImageView) objArrI06[9], constraintLayout5, constraintLayout6, (RecyclerView) objArrI06[14], appIconView4, dialogButtonComponent4, myketTextView12, myketTextView13, myketTextView14, (MyketTextView) objArrI06[4], (MyketTextView) objArrI06[6], (PaymentPriceView) objArrI06[13]);
                i46Var.M = -1L;
                i46Var.w.setTag(null);
                i46Var.A.setTag(null);
                i46Var.B.setTag(null);
                i46Var.C.setTag(null);
                i46Var.E.setTag(null);
                i46Var.I.setTag(null);
                i46Var.K.setTag(null);
                i46Var.l0(view);
                i46Var.g0();
                return i46Var;
            case 320:
                if ("layout/payment_gateway_view_0".equals(obj)) {
                    return new k46(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for payment_gateway_view is invalid. Received: "));
            case 321:
                if ("layout-fa/permissions_item_0".equals(obj)) {
                    return new f56(0, view);
                }
                if ("layout/permissions_item_0".equals(obj)) {
                    return new f56(1, view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for permissions_item is invalid. Received: "));
            case 322:
                if (!"layout/pika_confirm_connect_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for pika_confirm_connect_dialog is invalid. Received: "));
                }
                Object[] objArrI07 = a79.i0(view, 6, null, m76.B);
                MyketTextView myketTextView15 = (MyketTextView) objArrI07[2];
                MyketTextView myketTextView16 = (MyketTextView) objArrI07[1];
                DialogButtonComponent dialogButtonComponent5 = (DialogButtonComponent) objArrI07[5];
                LinearLayout linearLayout = (LinearLayout) objArrI07[3];
                m76 m76Var = new m76(null, view, myketTextView15, myketTextView16, dialogButtonComponent5, linearLayout);
                m76Var.A = -1L;
                m76Var.v.setTag(null);
                m76Var.w.setTag(null);
                ((FrameLayout) objArrI07[0]).setTag(null);
                m76Var.l0(view);
                m76Var.g0();
                return m76Var;
            case 323:
                if (!"layout/pika_connect_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for pika_connect_fragment is invalid. Received: "));
                }
                Object[] objArrI08 = a79.i0(view, 5, null, r76.B);
                r76 r76Var = new r76(null, view, (RippleBackground) objArrI08[4], (MyketTextView) objArrI08[2], (MyketTextView) objArrI08[3], (MyketTextView) objArrI08[1]);
                r76Var.A = -1L;
                r76Var.w.setTag(null);
                r76Var.x.setTag(null);
                ((ConstraintLayout) objArrI08[0]).setTag(null);
                r76Var.y.setTag(null);
                r76Var.l0(view);
                r76Var.g0();
                return r76Var;
            case 324:
                if ("layout/pika_end_point_holder_0".equals(obj)) {
                    return new u76(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for pika_end_point_holder is invalid. Received: "));
            case 325:
                if (!"layout/pika_search_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for pika_search is invalid. Received: "));
                }
                Object[] objArrI09 = a79.i0(view, 4, null, e86.A);
                e86 e86Var = new e86(null, view, (ImageView) objArrI09[2], (ImageView) objArrI09[3], (MyketEditText) objArrI09[1], (ConstraintLayout) objArrI09[0]);
                e86Var.z = -1L;
                e86Var.v.setTag(null);
                e86Var.x.setTag(null);
                e86Var.y.setTag(null);
                e86Var.l0(view);
                e86Var.g0();
                return e86Var;
            case 326:
                if (!"layout/pika_select_device_bottom_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for pika_select_device_bottom_dialog is invalid. Received: "));
                }
                Object[] objArrI010 = a79.i0(view, 3, null, h86.z);
                h86 h86Var = new h86(null, view, (LinearLayout) objArrI010[0], (RecyclerView) objArrI010[2]);
                h86Var.y = -1L;
                h86Var.v.setTag(null);
                h86Var.l0(view);
                h86Var.g0();
                return h86Var;
            case 327:
                if (!"layout/pika_select_device_title_holder_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for pika_select_device_title_holder is invalid. Received: "));
                }
                Object[] objArrI011 = a79.i0(view, 2, null, null);
                j86 j86Var = new j86(null, view, (ConstraintLayout) objArrI011[0], (MyketTextView) objArrI011[1]);
                j86Var.x = -1L;
                j86Var.v.setTag(null);
                j86Var.w.setTag(null);
                j86Var.l0(view);
                j86Var.g0();
                return j86Var;
            case 328:
                if ("layout/popup_window_0".equals(obj)) {
                    return new ji6(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for popup_window is invalid. Received: "));
            case 329:
                if (!"layout/popup_window_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for popup_window_item is invalid. Received: "));
                }
                Object[] objArrI012 = a79.i0(view, 4, null, li6.A);
                li6 li6Var = new li6(null, view, (ImageView) objArrI012[1], (LoadingView) objArrI012[2], (MyketTextView) objArrI012[3]);
                li6Var.z = -1L;
                ((LinearLayout) objArrI012[0]).setTag(null);
                li6Var.l0(view);
                li6Var.g0();
                return li6Var;
            case 330:
                if (!"layout/profile_relation_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for profile_relation_view is invalid. Received: "));
                }
                Object[] objArrI013 = a79.i0(view, 3, null, tl6.z);
                tl6 tl6Var = new tl6(null, view, (SmallFillOvalButton) objArrI013[1], (SmallEmptyMediumTextOvalButton) objArrI013[2]);
                tl6Var.y = -1L;
                ((FrameLayout) objArrI013[0]).setTag(null);
                tl6Var.l0(view);
                tl6Var.g0();
                return tl6Var;
            case 331:
                if (!"layout/purchase_transaction_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for purchase_transaction_item is invalid. Received: "));
                }
                Object[] objArrI014 = a79.i0(view, 12, null, yn6.G);
                View view6 = (View) objArrI014[10];
                ConstraintLayout constraintLayout7 = (ConstraintLayout) objArrI014[0];
                MyketTextView myketTextView17 = (MyketTextView) objArrI014[4];
                View view7 = (View) objArrI014[7];
                MyketTextView myketTextView18 = (MyketTextView) objArrI014[8];
                MyketTextView myketTextView19 = (MyketTextView) objArrI014[3];
                yn6 yn6Var = new yn6(null, view, view6, constraintLayout7, myketTextView17, view7, myketTextView18, myketTextView19, (ImageView) objArrI014[2], (MyketTextView) objArrI014[1], (MyketTextView) objArrI014[5], (MyketTextView) objArrI014[6]);
                yn6Var.F = -1L;
                yn6Var.w.setTag(null);
                yn6Var.x.setTag(null);
                yn6Var.y.setTag(null);
                yn6Var.z.setTag(null);
                yn6Var.A.setTag(null);
                yn6Var.B.setTag(null);
                yn6Var.C.setTag(null);
                yn6Var.D.setTag(null);
                yn6Var.E.setTag(null);
                yn6Var.l0(view);
                yn6Var.g0();
                return yn6Var;
            case 332:
                if (!"layout/radiobutton_multiple_choice_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for radiobutton_multiple_choice is invalid. Received: "));
                }
                Object[] objArrI015 = a79.i0(view, 6, null, xu6.D);
                xu6 xu6Var = new xu6(null, view, (SmallBoldTextButton) objArrI015[5], (FrameLayout) objArrI015[0], (MyketRadioButton) objArrI015[2], (MyketTextView) objArrI015[4], (MovieNewTagView) objArrI015[1], (MyketTextView) objArrI015[3]);
                xu6Var.C = -1L;
                xu6Var.w.setTag(null);
                xu6Var.z.setTag(null);
                xu6Var.l0(view);
                xu6Var.g0();
                return xu6Var;
            case 333:
                if (!"layout/rate_review_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for rate_review is invalid. Received: "));
                }
                Object[] objArrI016 = a79.i0(view, 4, null, dv6.z);
                dv6 dv6Var = new dv6(null, view, (ConstraintLayout) objArrI016[2], (MyketRatingBar) objArrI016[3], (MyketTextView) objArrI016[1]);
                dv6Var.y = -1L;
                ((FrameLayout) objArrI016[0]).setTag(null);
                dv6Var.x.setTag(null);
                dv6Var.l0(view);
                dv6Var.g0();
                return dv6Var;
            case 334:
                if ("layout/rate_without_comment_0".equals(obj)) {
                    return new ev6(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for rate_without_comment is invalid. Received: "));
            case 335:
                if (!"layout/receive_update_require_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for receive_update_require_dialog is invalid. Received: "));
                }
                Object[] objArrI017 = a79.i0(view, 5, null, rw6.A);
                MyketTextView myketTextView20 = (MyketTextView) objArrI017[1];
                DialogButtonComponent dialogButtonComponent6 = (DialogButtonComponent) objArrI017[4];
                LinearLayout linearLayout2 = (LinearLayout) objArrI017[2];
                rw6 rw6Var = new rw6(null, view, myketTextView20, dialogButtonComponent6, linearLayout2);
                rw6Var.z = -1L;
                rw6Var.v.setTag(null);
                ((FrameLayout) objArrI017[0]).setTag(null);
                rw6Var.l0(view);
                rw6Var.g0();
                return rw6Var;
            case 336:
                if (!"layout/received_app_holder_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for received_app_holder is invalid. Received: "));
                }
                Object[] objArrI018 = a79.i0(view, 5, null, tw6.B);
                tw6 tw6Var = new tw6(null, view, (AppIconView) objArrI018[2], (MyketTextView) objArrI018[1], (ConstraintLayout) objArrI018[0], (MyketTextView) objArrI018[3], (PikaReceiveView) objArrI018[4]);
                tw6Var.A = -1L;
                tw6Var.w.setTag(null);
                tw6Var.x.setTag(null);
                tw6Var.l0(view);
                tw6Var.g0();
                return tw6Var;
            case 337:
                if (!"layout/recent_download_bottom_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for recent_download_bottom_dialog is invalid. Received: "));
                }
                Object[] objArrI019 = a79.i0(view, 5, null, vw6.A);
                vw6 vw6Var = new vw6(null, view, (View) objArrI019[3], (RecyclerView) objArrI019[4], (DialogHeaderComponent) objArrI019[2]);
                vw6Var.z = -1L;
                ((ConstraintLayout) objArrI019[0]).setTag(null);
                vw6Var.l0(view);
                vw6Var.g0();
                return vw6Var;
            case 338:
                if ("layout/recent_download_holder_0".equals(obj)) {
                    return new dx6(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for recent_download_holder is invalid. Received: "));
            case 339:
                if (!"layout/recycler_list_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for recycler_list is invalid. Received: "));
                }
                Object[] objArrI020 = a79.i0(view, 8, dz6.E, dz6.F);
                dz6 dz6Var = new dz6(null, view, (View) objArrI020[4], (kc2) objArrI020[2], (ConstraintLayout) objArrI020[0], (RecyclerView) objArrI020[5], (View) objArrI020[7], (ExtendedSwipeRefreshLayout) objArrI020[3], (TryAgainView) objArrI020[6]);
                dz6Var.D = -1L;
                kc2 kc2Var = dz6Var.w;
                if (kc2Var != null) {
                    kc2Var.q = dz6Var;
                }
                dz6Var.x.setTag(null);
                ((ConstraintLayout) objArrI020[1]).setTag(null);
                dz6Var.l0(view);
                dz6Var.g0();
                return dz6Var;
            case 340:
                if (!"layout/recycler_list_no_refresh_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for recycler_list_no_refresh is invalid. Received: "));
                }
                Object[] objArrI021 = a79.i0(view, 6, fz6.D, fz6.E);
                fz6 fz6Var = new fz6(null, view, (View) objArrI021[2], (kc2) objArrI021[1], (ConstraintLayout) objArrI021[0], (RecyclerView) objArrI021[3], (View) objArrI021[5], (TryAgainView) objArrI021[4]);
                fz6Var.C = -1L;
                kc2 kc2Var2 = fz6Var.w;
                if (kc2Var2 != null) {
                    kc2Var2.q = fz6Var;
                }
                fz6Var.x.setTag(null);
                fz6Var.l0(view);
                fz6Var.g0();
                return fz6Var;
            case 341:
                if (!"layout/recycler_list_no_refresh_no_try_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for recycler_list_no_refresh_no_try is invalid. Received: "));
                }
                Object[] objArrI022 = a79.i0(view, 5, hz6.C, hz6.D);
                hz6 hz6Var = new hz6(null, view, (View) objArrI022[2], (kc2) objArrI022[1], (ConstraintLayout) objArrI022[0], (RecyclerView) objArrI022[3], (View) objArrI022[4]);
                hz6Var.B = -1L;
                kc2 kc2Var3 = hz6Var.w;
                if (kc2Var3 != null) {
                    kc2Var3.q = hz6Var;
                }
                hz6Var.x.setTag(null);
                hz6Var.l0(view);
                hz6Var.g0();
                return hz6Var;
            case 342:
                if (!"layout/recycler_list_no_try_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for recycler_list_no_try is invalid. Received: "));
                }
                Object[] objArrI023 = a79.i0(view, 6, jz6.C, jz6.D);
                jz6 jz6Var = new jz6(null, view, (View) objArrI023[3], (kc2) objArrI023[2], (RecyclerView) objArrI023[4], (View) objArrI023[5], (ExtendedSwipeRefreshLayout) objArrI023[0]);
                jz6Var.B = -1L;
                kc2 kc2Var4 = jz6Var.w;
                if (kc2Var4 != null) {
                    kc2Var4.q = jz6Var;
                }
                ((ConstraintLayout) objArrI023[1]).setTag(null);
                jz6Var.z.setTag(null);
                jz6Var.l0(view);
                jz6Var.g0();
                return jz6Var;
            case 343:
                if (!"layout/reel_ad_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for reel_ad_item is invalid. Received: "));
                }
                Object[] objArrI024 = a79.i0(view, 22, h07.Q, h07.R);
                MyketTextView myketTextView21 = (MyketTextView) objArrI024[15];
                View view8 = (View) objArrI024[4];
                View view9 = (View) objArrI024[10];
                ImageView imageView6 = (ImageView) objArrI024[13];
                MyketTextView myketTextView22 = (MyketTextView) objArrI024[14];
                LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrI024[12];
                MyketTextView myketTextView23 = (MyketTextView) objArrI024[1];
                LoadingView loadingView = (LoadingView) objArrI024[19];
                View view10 = (View) objArrI024[18];
                Group group = (Group) objArrI024[21];
                MyketTextView myketTextView24 = (MyketTextView) objArrI024[6];
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) objArrI024[11];
                PlayerView playerView = (PlayerView) objArrI024[9];
                MyketTextView myketTextView25 = (MyketTextView) objArrI024[7];
                ConstraintLayout constraintLayout8 = (ConstraintLayout) objArrI024[0];
                Group group2 = (Group) objArrI024[17];
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArrI024[5];
                w17 w17Var = (w17) objArrI024[8];
                h07 h07Var = new h07(null, view, myketTextView21, view8, view9, imageView6, myketTextView22, lottieAnimationView, myketTextView23, loadingView, view10, group, myketTextView24, lottieAnimationView2, playerView, myketTextView25, constraintLayout8, group2, shimmerFrameLayout, w17Var, (MyketTextView) objArrI024[3], (MyketTextView) objArrI024[2]);
                h07Var.P = -1L;
                h07Var.w.setTag(null);
                h07Var.B.setTag(null);
                h07Var.F.setTag(null);
                h07Var.I.setTag(null);
                h07Var.J.setTag(null);
                h07Var.L.setTag(null);
                w17 w17Var2 = h07Var.M;
                if (w17Var2 != null) {
                    w17Var2.q = h07Var;
                }
                h07Var.N.setTag(null);
                h07Var.O.setTag(null);
                h07Var.l0(view);
                h07Var.g0();
                return h07Var;
            case 344:
                if (!"layout/reel_card_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for reel_card is invalid. Received: "));
                }
                Object[] objArrI025 = a79.i0(view, 6, null, o07.B);
                o07 o07Var = new o07(null, view, (FrameLayout) objArrI025[4], (View) objArrI025[5], (FrameLayout) objArrI025[2], (AppIconView) objArrI025[3], (ScreenshotView) objArrI025[1]);
                o07Var.A = -1L;
                ((LinearLayout) objArrI025[0]).setTag(null);
                o07Var.l0(view);
                o07Var.g0();
                return o07Var;
            case 345:
                if (!"layout/reel_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for reel_item is invalid. Received: "));
                }
                Object[] objArrI026 = a79.i0(view, 26, r07.T, r07.U);
                View view11 = (View) objArrI026[4];
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) objArrI026[20];
                View view12 = (View) objArrI026[12];
                PlayerControlView playerControlView = (PlayerControlView) objArrI026[13];
                MyketTextView myketTextView26 = (MyketTextView) objArrI026[3];
                LoadingView loadingView2 = (LoadingView) objArrI026[16];
                ImageView imageView7 = (ImageView) objArrI026[17];
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) objArrI026[9];
                MyketTextView myketTextView27 = (MyketTextView) objArrI026[2];
                LoadingView loadingView3 = (LoadingView) objArrI026[23];
                View view13 = (View) objArrI026[22];
                Group group3 = (Group) objArrI026[25];
                MyketTextView myketTextView28 = (MyketTextView) objArrI026[6];
                LottieAnimationView lottieAnimationView4 = (LottieAnimationView) objArrI026[18];
                MyketTextView myketTextView29 = (MyketTextView) objArrI026[1];
                PlayerView playerView2 = (PlayerView) objArrI026[10];
                AvatarImageView avatarImageView = (AvatarImageView) objArrI026[14];
                Group group4 = (Group) objArrI026[15];
                MyketTextView myketTextView30 = (MyketTextView) objArrI026[7];
                Group group5 = (Group) objArrI026[21];
                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) objArrI026[5];
                w17 w17Var3 = (w17) objArrI026[8];
                LottieAnimationView lottieAnimationView5 = (LottieAnimationView) objArrI026[19];
                r07 r07Var = new r07(null, view, view11, lottieAnimationView3, view12, playerControlView, myketTextView26, loadingView2, imageView7, defaultTimeBar, myketTextView27, loadingView3, view13, group3, myketTextView28, lottieAnimationView4, myketTextView29, playerView2, avatarImageView, group4, myketTextView30, group5, shimmerFrameLayout2, w17Var3, lottieAnimationView5);
                r07Var.S = -1L;
                r07Var.v.setTag(null);
                r07Var.z.setTag(null);
                r07Var.D.setTag(null);
                r07Var.H.setTag(null);
                ((ConstraintLayout) objArrI026[0]).setTag(null);
                r07Var.J.setTag(null);
                r07Var.N.setTag(null);
                r07Var.P.setTag(null);
                w17 w17Var4 = r07Var.Q;
                if (w17Var4 != null) {
                    w17Var4.q = r07Var;
                }
                r07Var.l0(view);
                r07Var.g0();
                return r07Var;
            case 346:
                if (!"layout/reels_custom_controller_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for reels_custom_controller is invalid. Received: "));
                }
                Object[] objArrI027 = a79.i0(view, 2, null, y07.w);
                y07 y07Var = new y07(0, view, null);
                y07Var.v = -1L;
                ((ConstraintLayout) objArrI027[0]).setTag(null);
                y07Var.l0(view);
                y07Var.g0();
                return y07Var;
            case 347:
                if (!"layout/reels_home_item_rectangle_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for reels_home_item_rectangle is invalid. Received: "));
                }
                Object[] objArrI028 = a79.i0(view, 4, null, m17.z);
                m17 m17Var = new m17(null, view, (FrameLayout) objArrI028[2], (MyketTextView) objArrI028[3], (ScreenshotView) objArrI028[1]);
                m17Var.y = -1L;
                ((ConstraintLayout) objArrI028[0]).setTag(null);
                m17Var.l0(view);
                m17Var.g0();
                return m17Var;
            case 348:
                if (!"layout/reels_home_item_square_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for reels_home_item_square is invalid. Received: "));
                }
                Object[] objArrI029 = a79.i0(view, 4, null, o17.z);
                o17 o17Var = new o17(null, view, (FrameLayout) objArrI029[2], (MyketTextView) objArrI029[3], (ScreenshotView) objArrI029[1]);
                o17Var.y = -1L;
                ((ConstraintLayout) objArrI029[0]).setTag(null);
                o17Var.l0(view);
                o17Var.g0();
                return o17Var;
            case 349:
                if ("layout/reels_shimmer_layout_0".equals(obj)) {
                    return new x17(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for reels_shimmer_layout is invalid. Received: "));
            case 350:
                if (!"layout/report_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for report_dialog is invalid. Received: "));
                }
                Object[] objArrI030 = a79.i0(view, 9, null, h47.E);
                MyketTextView myketTextView31 = (MyketTextView) objArrI030[5];
                DialogButtonComponent dialogButtonComponent7 = (DialogButtonComponent) objArrI030[8];
                View view14 = (View) objArrI030[2];
                LinearLayout linearLayout3 = (LinearLayout) objArrI030[0];
                MyketEditText myketEditText = (MyketEditText) objArrI030[7];
                RadioGroup radioGroup = (RadioGroup) objArrI030[6];
                h47 h47Var = new h47(null, view, myketTextView31, dialogButtonComponent7, view14, linearLayout3, myketEditText, radioGroup, (DialogHeaderComponent) objArrI030[1]);
                h47Var.D = -1L;
                h47Var.y.setTag(null);
                h47Var.l0(view);
                h47Var.g0();
                return h47Var;
            default:
                return null;
        }
    }

    public static a79 k(int i, View view, Object obj) {
        switch (i) {
            case 351:
                if (!"layout/restricted_app_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for restricted_app is invalid. Received: "));
                }
                Object[] objArrI0 = a79.i0(view, 5, null, l77.A);
                l77 l77Var = new l77(null, view, (AppIconView) objArrI0[4], (View) objArrI0[1], (MyketTextView) objArrI0[3], (MyketTextView) objArrI0[2]);
                l77Var.z = -1L;
                l77Var.w.setTag(null);
                ((ConstraintLayout) objArrI0[0]).setTag(null);
                l77Var.x.setTag(null);
                l77Var.y.setTag(null);
                l77Var.l0(view);
                l77Var.g0();
                return l77Var;
            case 352:
                if ("layout/restricted_app_detail_0".equals(obj)) {
                    return new m77(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for restricted_app_detail is invalid. Received: "));
            case 353:
                if (!"layout/restriction_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for restriction_dialog is invalid. Received: "));
                }
                Object[] objArrI02 = a79.i0(view, 6, null, u77.C);
                MyketTextView myketTextView = (MyketTextView) objArrI02[2];
                u77 u77Var = new u77(null, view, myketTextView, (DialogButtonComponentVertical) objArrI02[5], (ImageView) objArrI02[4], (ConstraintLayout) objArrI02[0], (MyketTextView) objArrI02[1]);
                u77Var.B = -1L;
                u77Var.v.setTag(null);
                u77Var.y.setTag(null);
                u77Var.z.setTag(null);
                u77Var.l0(view);
                u77Var.g0();
                return u77Var;
            case 354:
                if ("layout/review_empty_data_0".equals(obj)) {
                    return new w31(2, view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for review_empty_data is invalid. Received: "));
            case 355:
                if ("layout/review_item_0".equals(obj)) {
                    return new z87(view);
                }
                if ("layout-fa/review_item_0".equals(obj)) {
                    return new y87(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for review_item is invalid. Received: "));
            case 356:
                if ("layout-fa/reviews_more_title_view_0".equals(obj)) {
                    Object[] objArrI03 = a79.i0(view, 3, null, d97.z);
                    d97 d97Var = new d97(null, view, (FrameLayout) objArrI03[0], (SmallBoldTextButton) objArrI03[2], (MyketTextView) objArrI03[1]);
                    d97Var.y = -1L;
                    d97Var.v.setTag(null);
                    d97Var.x.setTag(null);
                    d97Var.l0(view);
                    d97Var.g0();
                    return d97Var;
                }
                if (!"layout/reviews_more_title_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for reviews_more_title_view is invalid. Received: "));
                }
                Object[] objArrI04 = a79.i0(view, 3, null, e97.z);
                e97 e97Var = new e97(null, view, (FrameLayout) objArrI04[0], (SmallBoldTextButton) objArrI04[2], (MyketTextView) objArrI04[1]);
                e97Var.y = -1L;
                e97Var.v.setTag(null);
                e97Var.x.setTag(null);
                e97Var.l0(view);
                e97Var.g0();
                return e97Var;
            case 357:
                if (!"layout/schedule_download_type_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for schedule_download_type_dialog is invalid. Received: "));
                }
                Object[] objArrI05 = a79.i0(view, 5, null, me7.z);
                DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI05[4];
                LinearLayout linearLayout = (LinearLayout) objArrI05[0];
                RadioGroup radioGroup = (RadioGroup) objArrI05[3];
                me7 me7Var = new me7(null, view, dialogButtonComponent, linearLayout, radioGroup);
                me7Var.y = -1L;
                me7Var.w.setTag(null);
                me7Var.l0(view);
                me7Var.g0();
                return me7Var;
            case 358:
                if (!"layout/schedule_time_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for schedule_time_dialog is invalid. Received: "));
                }
                Object[] objArrI06 = a79.i0(view, 7, null, se7.C);
                se7 se7Var = new se7(null, view, (NumberPickerView) objArrI06[5], (DialogButtonComponent) objArrI06[6], (View) objArrI06[1], (MyketTextView) objArrI06[2], (DialogHeaderComponent) objArrI06[4]);
                se7Var.B = -1L;
                se7Var.x.setTag(null);
                se7Var.y.setTag(null);
                ((ConstraintLayout) objArrI06[0]).setTag(null);
                se7Var.l0(view);
                se7Var.g0();
                return se7Var;
            case 359:
                if (!"layout/screen_shot_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for screen_shot_item is invalid. Received: "));
                }
                Object[] objArrI07 = a79.i0(view, 3, null, vf7.z);
                vf7 vf7Var = new vf7(null, view, (LoadingView) objArrI07[2], (ZoomageView) objArrI07[1]);
                vf7Var.y = -1L;
                ((RelativeLayout) objArrI07[0]).setTag(null);
                vf7Var.l0(view);
                vf7Var.g0();
                return vf7Var;
            case 360:
                if ("layout/search_ads_app_0".equals(obj)) {
                    return new jh7(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for search_ads_app is invalid. Received: "));
            case 361:
                if ("layout/search_app_desc_card_0".equals(obj)) {
                    return new lh7(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for search_app_desc_card is invalid. Received: "));
            case 362:
                if ("layout/search_collapse_view_0".equals(obj)) {
                    return new vh7(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for search_collapse_view is invalid. Received: "));
            case 363:
                if ("layout-fa/search_history_list_title_0".equals(obj)) {
                    return new fi7(0, view);
                }
                if ("layout/search_history_list_title_0".equals(obj)) {
                    return new fi7(1, view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for search_history_list_title is invalid. Received: "));
            case 364:
                if (!"layout/search_list_title_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for search_list_title is invalid. Received: "));
                }
                Object[] objArrI08 = a79.i0(view, 3, null, vi7.y);
                vi7 vi7Var = new vi7(null, view, (MyketAdInfoView) objArrI08[2], (MyketTextView) objArrI08[1]);
                vi7Var.x = -1L;
                ((ConstraintLayout) objArrI08[0]).setTag(null);
                vi7Var.w.setTag(null);
                vi7Var.l0(view);
                vi7Var.g0();
                return vi7Var;
            case 365:
                if ("layout/search_normal_app_0".equals(obj)) {
                    return new aj7(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for search_normal_app is invalid. Received: "));
            case 366:
                if ("layout/search_screenshot_app_0".equals(obj)) {
                    return new lj7(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for search_screenshot_app is invalid. Received: "));
            case 367:
                if ("layout/search_scrollable_screenshot_app_0".equals(obj)) {
                    return new nj7(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for search_scrollable_screenshot_app is invalid. Received: "));
            case 368:
                if ("layout/search_snackbar_0".equals(obj)) {
                    return new pj7(1, view);
                }
                if ("layout-fa/search_snackbar_0".equals(obj)) {
                    return new pj7(0, view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for search_snackbar is invalid. Received: "));
            case 369:
                if (!"layout/select_quality_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for select_quality_dialog is invalid. Received: "));
                }
                Object[] objArrI09 = a79.i0(view, 6, null, mm7.A);
                View view2 = (View) objArrI09[3];
                mm7 mm7Var = new mm7(null, view, view2, (RecyclerView) objArrI09[5], (DialogHeaderComponent) objArrI09[2]);
                mm7Var.z = -1L;
                ((ConstraintLayout) objArrI09[0]).setTag(null);
                mm7Var.l0(view);
                mm7Var.g0();
                return mm7Var;
            case 370:
                if (!"layout/send_feedback_button_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for send_feedback_button_item is invalid. Received: "));
                }
                Object[] objArrI010 = a79.i0(view, 2, null, yn7.z);
                yn7 yn7Var = new yn7(null, view, (FrameLayout) objArrI010[0], (BigFillRectangleButton) objArrI010[1]);
                yn7Var.y = -1L;
                yn7Var.v.setTag(null);
                yn7Var.l0(view);
                yn7Var.g0();
                return yn7Var;
            case 371:
                if (!"layout/send_reply_bottom_dialog_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for send_reply_bottom_dialog_fragment is invalid. Received: "));
                }
                Object[] objArrI011 = a79.i0(view, 6, null, co7.B);
                co7 co7Var = new co7(null, view, (MyketEditText) objArrI011[4], (DialogButtonComponent) objArrI011[5], (View) objArrI011[1], (DialogHeaderComponent) objArrI011[3]);
                co7Var.A = -1L;
                co7Var.x.setTag(null);
                ((ConstraintLayout) objArrI011[0]).setTag(null);
                co7Var.l0(view);
                co7Var.g0();
                return co7Var;
            case 372:
                if (!"layout/setting_app_version_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for setting_app_version is invalid. Received: "));
                }
                Object[] objArrI012 = a79.i0(view, 2, null, tq7.y);
                tq7 tq7Var = new tq7(null, view, (ConstraintLayout) objArrI012[0], (MyketTextView) objArrI012[1]);
                tq7Var.x = -1L;
                tq7Var.v.setTag(null);
                tq7Var.l0(view);
                tq7Var.g0();
                return tq7Var;
            case 373:
                if (!"layout/setting_item_kids_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for setting_item_kids is invalid. Received: "));
                }
                Object[] objArrI013 = a79.i0(view, 4, null, wq7.z);
                wq7 wq7Var = new wq7(null, view, (MyketSwitch) objArrI013[1], (MyketTextView) objArrI013[3], (MyketTextView) objArrI013[2]);
                wq7Var.y = -1L;
                ((ConstraintLayout) objArrI013[0]).setTag(null);
                wq7Var.l0(view);
                wq7Var.g0();
                return wq7Var;
            case 374:
                if (!"layout/setting_night_mode_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for setting_night_mode_item is invalid. Received: "));
                }
                Object[] objArrI014 = a79.i0(view, 5, null, br7.B);
                br7 br7Var = new br7(null, view, (MyketSwitch) objArrI014[4], (View) objArrI014[3], (ConstraintLayout) objArrI014[0], (MyketTextView) objArrI014[2], (MyketTextView) objArrI014[1]);
                br7Var.A = -1L;
                br7Var.x.setTag(null);
                br7Var.l0(view);
                br7Var.g0();
                return br7Var;
            case 375:
                if (!"layout/setting_simple_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for setting_simple_item is invalid. Received: "));
                }
                Object[] objArrI015 = a79.i0(view, 3, null, hr7.z);
                hr7 hr7Var = new hr7(null, view, (ConstraintLayout) objArrI015[0], (MyketTextView) objArrI015[2], (MyketTextView) objArrI015[1]);
                hr7Var.y = -1L;
                hr7Var.v.setTag(null);
                hr7Var.l0(view);
                hr7Var.g0();
                return hr7Var;
            case 376:
                if (!"layout/setting_theme_style_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for setting_theme_style is invalid. Received: "));
                }
                Object[] objArrI016 = a79.i0(view, 4, null, kr7.z);
                kr7 kr7Var = new kr7(null, view, (View) objArrI016[2], (MyketTextView) objArrI016[3], (MyketTextView) objArrI016[1]);
                kr7Var.y = -1L;
                ((ConstraintLayout) objArrI016[0]).setTag(null);
                kr7Var.l0(view);
                kr7Var.g0();
                return kr7Var;
            case 377:
                if ("layout-w960dp/share_app_home_layout_0".equals(obj)) {
                    Object[] objArrI017 = a79.i0(view, 9, null, ot7.E);
                    ot7 ot7Var = new ot7(null, view, (MyketTextView) objArrI017[2], (LottieAnimationView) objArrI017[5], (MyketTextView) objArrI017[1], (SmallRegularTextButton) objArrI017[3], (BigEmptyOvalButton) objArrI017[8], (BigEmptyOvalButton) objArrI017[7], (View) objArrI017[4]);
                    ot7Var.D = -1L;
                    ot7Var.v.setTag(null);
                    ot7Var.x.setTag(null);
                    ((ConstraintLayout) objArrI017[0]).setTag(null);
                    ot7Var.y.setTag(null);
                    ot7Var.l0(view);
                    ot7Var.g0();
                    return ot7Var;
                }
                if (!"layout/share_app_home_layout_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for share_app_home_layout is invalid. Received: "));
                }
                Object[] objArrI018 = a79.i0(view, 8, null, nt7.E);
                nt7 nt7Var = new nt7(null, view, (MyketTextView) objArrI018[2], (LottieAnimationView) objArrI018[5], (MyketTextView) objArrI018[1], (SmallRegularTextButton) objArrI018[3], (BigEmptyOvalButton) objArrI018[7], (BigEmptyOvalButton) objArrI018[6], (View) objArrI018[4]);
                nt7Var.D = -1L;
                nt7Var.v.setTag(null);
                nt7Var.x.setTag(null);
                ((ConstraintLayout) objArrI018[0]).setTag(null);
                nt7Var.y.setTag(null);
                nt7Var.l0(view);
                nt7Var.g0();
                return nt7Var;
            case 378:
                if (!"layout/simple_action_bar_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for simple_action_bar is invalid. Received: "));
                }
                Object[] objArrI019 = a79.i0(view, 2, null, null);
                ew7 ew7Var = new ew7(null, view, (ImageView) objArrI019[1]);
                ew7Var.w = -1L;
                ew7Var.v.setTag(null);
                ((FrameLayout) objArrI019[0]).setTag(null);
                ew7Var.l0(view);
                ew7Var.g0();
                return ew7Var;
            case 379:
                if ("layout/single_action_toolbar_view_0".equals(obj)) {
                    Object[] objArrI020 = a79.i0(view, 4, null, vw7.B);
                    vw7 vw7Var = new vw7(null, view, (MyketTextView) objArrI020[1], (ImageView) objArrI020[2], (SmallFillOvalButton) objArrI020[3], (ConstraintLayout) objArrI020[0]);
                    vw7Var.A = -1L;
                    vw7Var.v.setTag(null);
                    vw7Var.w.setTag(null);
                    vw7Var.y.setTag(null);
                    vw7Var.l0(view);
                    vw7Var.g0();
                    return vw7Var;
                }
                if (!"layout-fa/single_action_toolbar_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for single_action_toolbar_view is invalid. Received: "));
                }
                Object[] objArrI021 = a79.i0(view, 4, null, uw7.B);
                uw7 uw7Var = new uw7(null, view, (MyketTextView) objArrI021[1], (ImageView) objArrI021[2], (SmallFillOvalButton) objArrI021[3], (ConstraintLayout) objArrI021[0]);
                uw7Var.A = -1L;
                uw7Var.v.setTag(null);
                uw7Var.w.setTag(null);
                uw7Var.y.setTag(null);
                uw7Var.l0(view);
                uw7Var.g0();
                return uw7Var;
            case 380:
                if (!"layout/single_select_dialog_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for single_select_dialog is invalid. Received: "));
                }
                Object[] objArrI022 = a79.i0(view, 4, null, px7.A);
                px7 px7Var = new px7(null, view, (View) objArrI022[2], (MyketMultiRadio) objArrI022[3], (DialogHeaderComponent) objArrI022[1]);
                px7Var.z = -1L;
                ((LinearLayout) objArrI022[0]).setTag(null);
                px7Var.l0(view);
                px7Var.g0();
                return px7Var;
            case 381:
                if (!"layout/special_main_card_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for special_main_card is invalid. Received: "));
                }
                Object[] objArrI023 = a79.i0(view, 8, null, s28.y);
                RelativeLayout relativeLayout = (RelativeLayout) objArrI023[0];
                s28 s28Var = new s28(null, view, relativeLayout, (MyketTextView) objArrI023[1]);
                s28Var.x = -1L;
                s28Var.v.setTag(null);
                s28Var.w.setTag(null);
                s28Var.l0(view);
                s28Var.g0();
                return s28Var;
            case 382:
                if (!"layout/splash_screen_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for splash_screen_fragment is invalid. Received: "));
                }
                Object[] objArrI024 = a79.i0(view, 2, null, f38.z);
                f38 f38Var = new f38(null, view, (LottieAnimationView) objArrI024[1], (ConstraintLayout) objArrI024[0]);
                f38Var.y = -1L;
                f38Var.w.setTag(null);
                f38Var.l0(view);
                f38Var.g0();
                return f38Var;
            case 383:
                if (!"layout/storage_usage_fixed_header_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for storage_usage_fixed_header is invalid. Received: "));
                }
                Object[] objArrI025 = a79.i0(view, 8, null, i68.F);
                i68 i68Var = new i68(null, view, (MyketTextView) objArrI025[2], (View) objArrI025[5], (ProgressBar) objArrI025[6], (View) objArrI025[7], (FrameLayout) objArrI025[3], (MyketTextView) objArrI025[4], (ConstraintLayout) objArrI025[0], (MyketTextView) objArrI025[1]);
                i68Var.E = -1L;
                i68Var.v.setTag(null);
                i68Var.z.setTag(null);
                i68Var.A.setTag(null);
                i68Var.B.setTag(null);
                i68Var.C.setTag(null);
                i68Var.l0(view);
                i68Var.g0();
                return i68Var;
            case 384:
                if (!"layout/streamer_avatar_item_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for streamer_avatar_item_view is invalid. Received: "));
                }
                Object[] objArrI026 = a79.i0(view, 5, null, s68.A);
                s68 s68Var = new s68(null, view, (AvatarImageView) objArrI026[4], (MyketTextView) objArrI026[1], (MyketTextView) objArrI026[2], (MyketTextView) objArrI026[3]);
                s68Var.z = -1L;
                s68Var.w.setTag(null);
                ((ConstraintLayout) objArrI026[0]).setTag(null);
                s68Var.x.setTag(null);
                s68Var.y.setTag(null);
                s68Var.l0(view);
                s68Var.g0();
                return s68Var;
            case 385:
                if (!"layout/streamer_header_item_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for streamer_header_item_view is invalid. Received: "));
                }
                Object[] objArrI027 = a79.i0(view, 2, null, null);
                u68 u68Var = new u68(null, view, (MyketTextView) objArrI027[1]);
                u68Var.w = -1L;
                u68Var.v.setTag(null);
                ((ConstraintLayout) objArrI027[0]).setTag(null);
                u68Var.l0(view);
                u68Var.g0();
                return u68Var;
            case 386:
                if (!"layout/streamer_name_item_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for streamer_name_item_view is invalid. Received: "));
                }
                Object[] objArrI028 = a79.i0(view, 5, null, b78.A);
                b78 b78Var = new b78(null, view, (SmallFillOvalButton) objArrI028[3], (SmallEmptyMediumTextOvalButton) objArrI028[4], (MyketTextView) objArrI028[1], (MyketTextView) objArrI028[2]);
                b78Var.z = -1L;
                ((ConstraintLayout) objArrI028[0]).setTag(null);
                b78Var.x.setTag(null);
                b78Var.y.setTag(null);
                b78Var.l0(view);
                b78Var.g0();
                return b78Var;
            case 387:
                if (!"layout/streamer_profile_collapse_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for streamer_profile_collapse_view is invalid. Received: "));
                }
                Object[] objArrI029 = a79.i0(view, 6, null, e78.B);
                ImageView imageView = (ImageView) objArrI029[3];
                ImageView imageView2 = (ImageView) objArrI029[4];
                e78 e78Var = new e78(null, view, (View) objArrI029[1], imageView, imageView2, (ImageView) objArrI029[5]);
                e78Var.A = -1L;
                ((ConstraintLayout) objArrI029[0]).setTag(null);
                e78Var.x.setTag(null);
                e78Var.l0(view);
                e78Var.g0();
                return e78Var;
            case 388:
                if (!"layout/streamer_profile_toolbar_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for streamer_profile_toolbar_view is invalid. Received: "));
                }
                Object[] objArrI030 = a79.i0(view, 5, null, k78.B);
                k78 k78Var = new k78(null, view, (ScreenshotView) objArrI030[4], (ImageView) objArrI030[3], (MyketTextView) objArrI030[1], (MyketTextView) objArrI030[2]);
                k78Var.A = -1L;
                ((ConstraintLayout) objArrI030[0]).setTag(null);
                k78Var.x.setTag(null);
                k78Var.y.setTag(null);
                k78Var.l0(view);
                k78Var.g0();
                return k78Var;
            case 389:
                if ("layout/sub_review_item_0".equals(obj)) {
                    Object[] objArrI031 = a79.i0(view, 12, null, s98.I);
                    s98 s98Var = new s98(null, view, (AvatarImageView) objArrI031[9], (MyketTextView) objArrI031[3], (MyketTextView) objArrI031[4], (MyketTextView) objArrI031[5], (BuzzProgressImageView) objArrI031[11], (MyketTextView) objArrI031[7], (ConstraintLayout) objArrI031[0], (BuzzProgressImageView) objArrI031[10], (MyketTextView) objArrI031[6], (MyketImageButton) objArrI031[1], (MyketTextView) objArrI031[2], (ImageView) objArrI031[8]);
                    s98Var.H = -1L;
                    s98Var.w.setTag(null);
                    s98Var.x.setTag(null);
                    s98Var.y.setTag(null);
                    s98Var.A.setTag(null);
                    s98Var.B.setTag(null);
                    s98Var.D.setTag(null);
                    s98Var.E.setTag(null);
                    s98Var.F.setTag(null);
                    s98Var.l0(view);
                    s98Var.g0();
                    return s98Var;
                }
                if (!"layout-fa/sub_review_item_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for sub_review_item is invalid. Received: "));
                }
                Object[] objArrI032 = a79.i0(view, 12, null, r98.I);
                r98 r98Var = new r98(null, view, (AvatarImageView) objArrI032[9], (MyketTextView) objArrI032[3], (MyketTextView) objArrI032[4], (MyketTextView) objArrI032[5], (BuzzProgressImageView) objArrI032[11], (MyketTextView) objArrI032[7], (ConstraintLayout) objArrI032[0], (BuzzProgressImageView) objArrI032[10], (MyketTextView) objArrI032[6], (MyketImageButton) objArrI032[1], (MyketTextView) objArrI032[2], (ImageView) objArrI032[8]);
                r98Var.H = -1L;
                r98Var.w.setTag(null);
                r98Var.x.setTag(null);
                r98Var.y.setTag(null);
                r98Var.A.setTag(null);
                r98Var.B.setTag(null);
                r98Var.D.setTag(null);
                r98Var.E.setTag(null);
                r98Var.F.setTag(null);
                r98Var.l0(view);
                r98Var.g0();
                return r98Var;
            case 390:
                if (!"layout/tag_view_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for tag_view is invalid. Received: "));
                }
                se8 se8Var = new se8(null, view, (MyketTextView) a79.i0(view, 1, null, null)[0]);
                se8Var.w = -1L;
                se8Var.v.setTag(null);
                se8Var.l0(view);
                se8Var.g0();
                return se8Var;
            case 391:
                if ("layout/template_radio_button_0".equals(obj)) {
                    return new mf8(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for template_radio_button is invalid. Received: "));
            case 392:
                if ("layout-w960dp/theme_style_fragment_0".equals(obj)) {
                    Object[] objArrI033 = a79.i0(view, 10, null, lk8.F);
                    MyketTextView myketTextView2 = (MyketTextView) objArrI033[2];
                    AppCompatImageView appCompatImageView = (AppCompatImageView) objArrI033[6];
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArrI033[3];
                    RecyclerView recyclerView = (RecyclerView) objArrI033[8];
                    NestedScrollView nestedScrollView = (NestedScrollView) objArrI033[0];
                    MyketTextView myketTextView3 = (MyketTextView) objArrI033[1];
                    View view3 = (View) objArrI033[4];
                    lk8 lk8Var = new lk8(null, view, myketTextView2, appCompatImageView, constraintLayout, recyclerView, nestedScrollView, myketTextView3, view3, (TryAgainView) objArrI033[9]);
                    lk8Var.E = -1L;
                    lk8Var.v.setTag(null);
                    lk8Var.z.setTag(null);
                    lk8Var.A.setTag(null);
                    lk8Var.l0(view);
                    lk8Var.g0();
                    return lk8Var;
                }
                if (!"layout/theme_style_fragment_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for theme_style_fragment is invalid. Received: "));
                }
                Object[] objArrI034 = a79.i0(view, 10, null, kk8.F);
                MyketTextView myketTextView4 = (MyketTextView) objArrI034[2];
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) objArrI034[6];
                ConstraintLayout constraintLayout2 = (ConstraintLayout) objArrI034[3];
                RecyclerView recyclerView2 = (RecyclerView) objArrI034[8];
                NestedScrollView nestedScrollView2 = (NestedScrollView) objArrI034[0];
                MyketTextView myketTextView5 = (MyketTextView) objArrI034[1];
                View view4 = (View) objArrI034[4];
                kk8 kk8Var = new kk8(null, view, myketTextView4, appCompatImageView2, constraintLayout2, recyclerView2, nestedScrollView2, myketTextView5, view4, (TryAgainView) objArrI034[9]);
                kk8Var.E = -1L;
                kk8Var.v.setTag(null);
                kk8Var.z.setTag(null);
                kk8Var.A.setTag(null);
                kk8Var.l0(view);
                kk8Var.g0();
                return kk8Var;
            case 393:
                if ("layout/theme_style_toolbar_view_0".equals(obj)) {
                    return new nk8(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for theme_style_toolbar_view is invalid. Received: "));
            case 394:
                if (!"layout/theme_toggle_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for theme_toggle is invalid. Received: "));
                }
                Object[] objArrI035 = a79.i0(view, 3, null, qk8.y);
                qk8 qk8Var = new qk8(null, view, (ImageView) objArrI035[1]);
                qk8Var.x = -1L;
                qk8Var.v.setTag(null);
                ((ConstraintLayout) objArrI035[0]).setTag(null);
                qk8Var.l0(view);
                qk8Var.g0();
                return qk8Var;
            case 395:
                if (!"layout/toast_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for toast is invalid. Received: "));
                }
                Object[] objArrI036 = a79.i0(view, 3, null, qm8.A);
                qm8 qm8Var = new qm8(null, view, (ConstraintLayout) objArrI036[0], (LottieAnimationView) objArrI036[2], (MyketTextView) objArrI036[1]);
                qm8Var.z = -1L;
                qm8Var.v.setTag(null);
                qm8Var.l0(view);
                qm8Var.g0();
                return qm8Var;
            case 396:
                if (!"layout/toolbar_nearby_connection_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for toolbar_nearby_connection is invalid. Received: "));
                }
                Object[] objArrI037 = a79.i0(view, 6, null, tn8.D);
                tn8 tn8Var = new tn8(null, view, (AvatarImageView) objArrI037[5], (ImageView) objArrI037[4], (MyketTextView) objArrI037[3], (ConstraintLayout) objArrI037[0], (MyketTextView) objArrI037[2], (MyketTextView) objArrI037[1]);
                tn8Var.C = -1L;
                tn8Var.x.setTag(null);
                tn8Var.y.setTag(null);
                tn8Var.z.setTag(null);
                tn8Var.A.setTag(null);
                tn8Var.l0(view);
                tn8Var.g0();
                return tn8Var;
            case 397:
                if (!"layout/toolbar_recent_download_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for toolbar_recent_download is invalid. Received: "));
                }
                Object[] objArrI038 = a79.i0(view, 5, null, vn8.C);
                vn8 vn8Var = new vn8(null, view, (ImageView) objArrI038[3], (ConstraintLayout) objArrI038[0], (ImageView) objArrI038[2], (SmallFillOvalButton) objArrI038[4], (MyketTextView) objArrI038[1]);
                vn8Var.B = -1L;
                vn8Var.w.setTag(null);
                vn8Var.x.setTag(null);
                vn8Var.z.setTag(null);
                vn8Var.l0(view);
                vn8Var.g0();
                return vn8Var;
            case 398:
                if ("layout/tracking_app_payment_content_0".equals(obj)) {
                    return new op8(view);
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for tracking_app_payment_content is invalid. Received: "));
            case 399:
                if ("layout/trailer_finished_playing_view_0".equals(obj)) {
                    return new yp8(new View[]{view});
                }
                throw new IllegalArgumentException(o40.x(obj, "The tag for trailer_finished_playing_view is invalid. Received: "));
            case ErrorDTO.CODE_ACCESS_DENIED /* 400 */:
                if (!"layout/update_card_0".equals(obj)) {
                    throw new IllegalArgumentException(o40.x(obj, "The tag for update_card is invalid. Received: "));
                }
                Object[] objArrI039 = a79.i0(view, 16, null, dz8.F);
                FrameLayout frameLayout = (FrameLayout) objArrI039[1];
                ImageView imageView3 = (ImageView) objArrI039[3];
                MyketTextView myketTextView6 = (MyketTextView) objArrI039[2];
                FrameLayout frameLayout2 = (FrameLayout) objArrI039[0];
                dz8 dz8Var = new dz8(null, view, frameLayout, imageView3, myketTextView6, frameLayout2, (MyketTextView) objArrI039[6], (MyketTextView) objArrI039[7], (ConstraintLayout) objArrI039[14], (MyketTextView) objArrI039[5], (MyketTextView) objArrI039[4]);
                dz8Var.E = -1L;
                dz8Var.v.setTag(null);
                dz8Var.w.setTag(null);
                dz8Var.x.setTag(null);
                dz8Var.y.setTag(null);
                dz8Var.z.setTag(null);
                dz8Var.A.setTag(null);
                dz8Var.C.setTag(null);
                dz8Var.D.setTag(null);
                dz8Var.l0(view);
                dz8Var.g0();
                return dz8Var;
            default:
                return null;
        }
    }

    @Override // defpackage.ba1
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ba1
    public final a79 b(int i, View view) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch ((i2 - 1) / 50) {
                case 0:
                    return e(i2, view, tag);
                case 1:
                    return f(i2, view, tag);
                case 2:
                    switch (i2) {
                        case 101:
                            if ("layout/fragment_welcome_0".equals(tag)) {
                                return new bo2(view);
                            }
                            if ("layout-w960dp/fragment_welcome_0".equals(tag)) {
                                return new co2(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for fragment_welcome is invalid. Received: "));
                        case 102:
                            if (!"layout/full_screenshot_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for full_screenshot is invalid. Received: "));
                            }
                            Object[] objArrI0 = a79.i0(view, 5, null, vo2.C);
                            vo2 vo2Var = new vo2(null, view, (ImageView) objArrI0[3], (ImageView) objArrI0[4], (CircleIndicator) objArrI0[1], (ConstraintLayout) objArrI0[0], (ExtendedViewPager) objArrI0[2]);
                            vo2Var.B = -1L;
                            vo2Var.x.setTag(null);
                            vo2Var.y.setTag(null);
                            vo2Var.l0(view);
                            vo2Var.g0();
                            return vo2Var;
                        case 103:
                            if ("layout/gateway_view_0".equals(tag)) {
                                return new vq2(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for gateway_view is invalid. Received: "));
                        case 104:
                            if ("layout/header_dialog_component_0".equals(tag)) {
                                return new sx2(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for header_dialog_component is invalid. Received: "));
                        case 105:
                            if ("layout/header_reviews_0".equals(tag)) {
                                return new xx2(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for header_reviews is invalid. Received: "));
                        case 106:
                            if ("layout/header_reviews_info_0".equals(tag)) {
                                return new zx2(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for header_reviews_info is invalid. Received: "));
                        case 107:
                            if ("layout/holder_age_rate_0".equals(tag)) {
                                return new b13(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_age_rate is invalid. Received: "));
                        case 108:
                            if (!"layout/holder_answer_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_answer is invalid. Received: "));
                            }
                            Object[] objArrI02 = a79.i0(view, 2, null, null);
                            c13 c13Var = new c13(null, view, (ConstraintLayout) objArrI02[0], (MyketRadioButton) objArrI02[1]);
                            c13Var.x = -1L;
                            c13Var.v.setTag(null);
                            c13Var.w.setTag(null);
                            c13Var.l0(view);
                            c13Var.g0();
                            return c13Var;
                        case 109:
                            if (!"layout/holder_app_download_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_app_download is invalid. Received: "));
                            }
                            Object[] objArrI03 = a79.i0(view, 9, null, e13.F);
                            e13 e13Var = new e13(null, view, (ConstraintLayout) objArrI03[4], (View) objArrI03[3], (DownloadProgressBar) objArrI03[5], (MyketTextView) objArrI03[8], (FrameLayout) objArrI03[0], (MyketTextView) objArrI03[2], (MyketTextView) objArrI03[1], (BigFillOvalButton) objArrI03[6], (BigEmptyOvalButton) objArrI03[7]);
                            e13Var.E = -1L;
                            e13Var.z.setTag(null);
                            e13Var.A.setTag(null);
                            e13Var.B.setTag(null);
                            e13Var.l0(view);
                            e13Var.g0();
                            return e13Var;
                        case 110:
                            if ("layout/holder_app_product_0".equals(tag)) {
                                return new f13(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_app_product is invalid. Received: "));
                        case 111:
                            if ("layout/holder_app_screenshot_0".equals(tag)) {
                                return new h13(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_app_screenshot is invalid. Received: "));
                        case 112:
                            if (!"layout/holder_app_summary_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_app_summary is invalid. Received: "));
                            }
                            Object[] objArrI04 = a79.i0(view, 2, null, j13.x);
                            LinearLayout linearLayout = (LinearLayout) objArrI04[0];
                            j13 j13Var = new j13(null, view, linearLayout);
                            j13Var.w = -1L;
                            j13Var.v.setTag(null);
                            j13Var.l0(view);
                            j13Var.g0();
                            return j13Var;
                        case 113:
                            if (!"layout/holder_app_tags_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_app_tags is invalid. Received: "));
                            }
                            Object[] objArrI05 = a79.i0(view, 2, null, l13.y);
                            l13 l13Var = new l13(null, view, (RelativeLayout) objArrI05[0], (RecyclerView) objArrI05[1]);
                            l13Var.x = -1L;
                            l13Var.v.setTag(null);
                            l13Var.l0(view);
                            l13Var.g0();
                            return l13Var;
                        case 114:
                            if ("layout/holder_application_0".equals(tag)) {
                                return new n13(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_application is invalid. Received: "));
                        case 115:
                            if ("layout/holder_avatar_preview_0".equals(tag)) {
                                return new p13(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_avatar_preview is invalid. Received: "));
                        case 116:
                            if ("layout/holder_complete_review_item_0".equals(tag)) {
                                Object[] objArrI06 = a79.i0(view, 9, null, s13.E);
                                s13 s13Var = new s13(null, view, (AppIconView) objArrI06[5], (AppInfoView) objArrI06[7], (MyketTextView) objArrI06[1], (MyketTextView) objArrI06[2], (MyketTextView) objArrI06[3], (FrameLayout) objArrI06[0], (MyketImageButton) objArrI06[4], (MyketRatingBar) objArrI06[8]);
                                s13Var.D = -1L;
                                s13Var.x.setTag(null);
                                s13Var.y.setTag(null);
                                s13Var.z.setTag(null);
                                s13Var.A.setTag(null);
                                s13Var.B.setTag(null);
                                s13Var.l0(view);
                                s13Var.g0();
                                return s13Var;
                            }
                            if (!"layout-fa/holder_complete_review_item_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_complete_review_item is invalid. Received: "));
                            }
                            Object[] objArrI07 = a79.i0(view, 9, null, r13.E);
                            r13 r13Var = new r13(null, view, (AppIconView) objArrI07[5], (AppInfoView) objArrI07[7], (MyketTextView) objArrI07[1], (MyketTextView) objArrI07[2], (MyketTextView) objArrI07[3], (FrameLayout) objArrI07[0], (MyketImageButton) objArrI07[4], (MyketRatingBar) objArrI07[8]);
                            r13Var.D = -1L;
                            r13Var.x.setTag(null);
                            r13Var.y.setTag(null);
                            r13Var.z.setTag(null);
                            r13Var.A.setTag(null);
                            r13Var.B.setTag(null);
                            r13Var.l0(view);
                            r13Var.g0();
                            return r13Var;
                        case 117:
                            if ("layout/holder_custom_list_add_0".equals(tag)) {
                                return new u13(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_custom_list_add is invalid. Received: "));
                        case 118:
                            if ("layout/holder_custom_list_add_title_0".equals(tag)) {
                                return new w13(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_custom_list_add_title is invalid. Received: "));
                        case 119:
                            if ("layout/holder_custom_list_buttons_0".equals(tag)) {
                                return new y13(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_custom_list_buttons is invalid. Received: "));
                        case 120:
                            if ("layout/holder_custom_list_empty_0".equals(tag)) {
                                return new a23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_custom_list_empty is invalid. Received: "));
                        case 121:
                            if ("layout/holder_custom_list_title_0".equals(tag)) {
                                return new b23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_custom_list_title is invalid. Received: "));
                        case 122:
                            if ("layout/holder_description_0".equals(tag)) {
                                return new c23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_description is invalid. Received: "));
                        case 123:
                            if ("layout/holder_download_quality_title_0".equals(tag)) {
                                return new d23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_download_quality_title is invalid. Received: "));
                        case 124:
                            if (!"layout/holder_ext_header_app_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_ext_header_app is invalid. Received: "));
                            }
                            Object[] objArrI08 = a79.i0(view, 3, null, f23.z);
                            f23 f23Var = new f23(null, view, (MyketAdInfoView) objArrI08[2], (ConstraintLayout) objArrI08[0], (MyketTextView) objArrI08[1]);
                            f23Var.y = -1L;
                            f23Var.w.setTag(null);
                            f23Var.x.setTag(null);
                            f23Var.l0(view);
                            f23Var.g0();
                            return f23Var;
                        case 125:
                            if (!"layout/holder_ext_header_clickable_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_ext_header_clickable is invalid. Received: "));
                            }
                            Object[] objArrI09 = a79.i0(view, 4, null, h23.A);
                            h23 h23Var = new h23(null, view, (MyketAdInfoView) objArrI09[2], (ConstraintLayout) objArrI09[0], (SmallBoldTextButton) objArrI09[3], (MyketTextView) objArrI09[1]);
                            h23Var.z = -1L;
                            h23Var.w.setTag(null);
                            h23Var.y.setTag(null);
                            h23Var.l0(view);
                            h23Var.g0();
                            return h23Var;
                        case 126:
                            if ("layout/holder_font_item_0".equals(tag)) {
                                return new i23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_font_item is invalid. Received: "));
                        case 127:
                            if ("layout/holder_grid_shimmer_reels_0".equals(tag)) {
                                return new k23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_grid_shimmer_reels is invalid. Received: "));
                        case 128:
                            if ("layout/holder_half_price_notice_0".equals(tag)) {
                                return new l23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_half_price_notice is invalid. Received: "));
                        case 129:
                            if (!"layout/holder_harmful_app_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_harmful_app is invalid. Received: "));
                            }
                            Object[] objArrI010 = a79.i0(view, 4, null, n23.A);
                            n23 n23Var = new n23(null, view, (AppIconView) objArrI010[2], (MyketTextView) objArrI010[1], (ConstraintLayout) objArrI010[0], (SmallEmptyMediumTextOvalButton) objArrI010[3]);
                            n23Var.z = -1L;
                            n23Var.w.setTag(null);
                            n23Var.x.setTag(null);
                            n23Var.l0(view);
                            n23Var.g0();
                            return n23Var;
                        case 130:
                            if ("layout-fa/holder_home_app_review_0".equals(tag)) {
                                return new p23(view);
                            }
                            if ("layout/holder_home_app_review_0".equals(tag)) {
                                return new q23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_home_app_review is invalid. Received: "));
                        case 131:
                            if ("layout/holder_home_banner_app_inner_0".equals(tag)) {
                                return new s23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_home_banner_app_inner is invalid. Received: "));
                        case 132:
                            if ("layout/holder_home_banner_app_inner_digested_0".equals(tag)) {
                                return new u23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_home_banner_app_inner_digested is invalid. Received: "));
                        case 133:
                            if ("layout/holder_home_banner_app_outer_0".equals(tag)) {
                                return new w23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_home_banner_app_outer is invalid. Received: "));
                        case 134:
                            if ("layout/holder_home_banner_app_outer_digested_0".equals(tag)) {
                                return new y23(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_home_banner_app_outer_digested is invalid. Received: "));
                        case 135:
                            if ("layout/holder_home_top_banner_0".equals(tag)) {
                                return new a33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_home_top_banner is invalid. Received: "));
                        case 136:
                            if ("layout/holder_huge_banner_0".equals(tag)) {
                                return new c33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_huge_banner is invalid. Received: "));
                        case 137:
                            if ("layout/holder_incomplete_review_0".equals(tag)) {
                                return new f33(view);
                            }
                            if ("layout-fa/holder_incomplete_review_0".equals(tag)) {
                                return new e33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_incomplete_review is invalid. Received: "));
                        case 138:
                            if ("layout/holder_installed_app_0".equals(tag)) {
                                return new h33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_installed_app is invalid. Received: "));
                        case 139:
                            if ("layout/holder_installed_app_title_0".equals(tag)) {
                                return new i33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_installed_app_title is invalid. Received: "));
                        case 140:
                            if ("layout/holder_installed_app_usage_0".equals(tag)) {
                                return new k33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_installed_app_usage is invalid. Received: "));
                        case 141:
                            if ("layout/holder_intro_item_0".equals(tag)) {
                                return new m33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_intro_item is invalid. Received: "));
                        case 142:
                            if ("layout/holder_large_shimmer_banners_0".equals(tag)) {
                                return new o33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_large_shimmer_banners is invalid. Received: "));
                        case 143:
                            if ("layout/holder_large_shimmer_movies_0".equals(tag)) {
                                return new q33(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for holder_large_shimmer_movies is invalid. Received: "));
                        case 144:
                            if (!"layout/holder_large_shimmer_reels_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_large_shimmer_reels is invalid. Received: "));
                            }
                            Object[] objArrI011 = a79.i0(view, 3, null, s33.y);
                            s33 s33Var = new s33(null, view, (AlphaAnimationView) objArrI011[1], (View) objArrI011[2]);
                            s33Var.x = -1L;
                            ((LinearLayout) objArrI011[0]).setTag(null);
                            s33Var.l0(view);
                            s33Var.g0();
                            return s33Var;
                        case 145:
                            if (!"layout/holder_last_version_note_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_last_version_note is invalid. Received: "));
                            }
                            Object[] objArrI012 = a79.i0(view, 3, null, u33.y);
                            u33 u33Var = new u33(null, view, (LinearLayout) objArrI012[2], (MyketTextView) objArrI012[1]);
                            u33Var.x = -1L;
                            ((RelativeLayout) objArrI012[0]).setTag(null);
                            u33Var.w.setTag(null);
                            u33Var.l0(view);
                            u33Var.g0();
                            return u33Var;
                        case 146:
                            if (!"layout/holder_manage_update_schedule_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_manage_update_schedule is invalid. Received: "));
                            }
                            Object[] objArrI013 = a79.i0(view, 4, null, w33.A);
                            w33 w33Var = new w33(null, view, (MyketSwitch) objArrI013[3], (FrameLayout) objArrI013[2], (FrameLayout) objArrI013[0], (MyketTextView) objArrI013[1]);
                            w33Var.z = -1L;
                            w33Var.x.setTag(null);
                            w33Var.y.setTag(null);
                            w33Var.l0(view);
                            w33Var.g0();
                            return w33Var;
                        case 147:
                            if (!"layout/holder_medium_movie_horizontal_list_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_medium_movie_horizontal_list is invalid. Received: "));
                            }
                            Object[] objArrI014 = a79.i0(view, 6, null, y33.y);
                            LinearLayout linearLayout2 = (LinearLayout) objArrI014[0];
                            ConstraintLayout constraintLayout = (ConstraintLayout) objArrI014[1];
                            y33 y33Var = new y33(null, view, linearLayout2, constraintLayout);
                            y33Var.x = -1L;
                            y33Var.v.setTag(null);
                            y33Var.w.setTag(null);
                            y33Var.l0(view);
                            y33Var.g0();
                            return y33Var;
                        case 148:
                            if (!"layout/holder_medium_shimmer_banners_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_medium_shimmer_banners is invalid. Received: "));
                            }
                            Object[] objArrI015 = a79.i0(view, 4, null, a43.z);
                            a43 a43Var = new a43(null, view, (AlphaAnimationView) objArrI015[1], (View) objArrI015[3], (AlphaAnimationView) objArrI015[2]);
                            a43Var.y = -1L;
                            ((ConstraintLayout) objArrI015[0]).setTag(null);
                            a43Var.l0(view);
                            a43Var.g0();
                            return a43Var;
                        case 149:
                            if (!"layout/holder_medium_shimmer_movies_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_medium_shimmer_movies is invalid. Received: "));
                            }
                            Object[] objArrI016 = a79.i0(view, 4, null, c43.z);
                            c43 c43Var = new c43(null, view, (AlphaAnimationView) objArrI016[1], (View) objArrI016[3], (AlphaAnimationView) objArrI016[2]);
                            c43Var.y = -1L;
                            ((ConstraintLayout) objArrI016[0]).setTag(null);
                            c43Var.l0(view);
                            c43Var.g0();
                            return c43Var;
                        case 150:
                            if (!"layout/holder_medium_shimmer_reels_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for holder_medium_shimmer_reels is invalid. Received: "));
                            }
                            Object[] objArrI017 = a79.i0(view, 3, null, e43.y);
                            e43 e43Var = new e43(null, view, (AlphaAnimationView) objArrI017[1], (View) objArrI017[2]);
                            e43Var.x = -1L;
                            ((LinearLayout) objArrI017[0]).setTag(null);
                            e43Var.l0(view);
                            e43Var.g0();
                            return e43Var;
                    }
                case 3:
                    return g(i2, view, tag);
                case 4:
                    return h(i2, view, tag);
                case 5:
                    return i(i2, view, tag);
                case 6:
                    return j(i2, view, tag);
                case 7:
                    return k(i2, view, tag);
                case 8:
                    switch (i2) {
                        case ErrorDTO.CODE_SERVER_SING_OUT /* 401 */:
                            if (!"layout/update_card_myket_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for update_card_myket is invalid. Received: "));
                            }
                            Object[] objArrI018 = a79.i0(view, 18, null, fz8.I);
                            FrameLayout frameLayout = (FrameLayout) objArrI018[1];
                            ImageView imageView = (ImageView) objArrI018[4];
                            MyketTextView myketTextView = (MyketTextView) objArrI018[3];
                            FrameLayout frameLayout2 = (FrameLayout) objArrI018[0];
                            FastDownloadView fastDownloadView = (FastDownloadView) objArrI018[15];
                            ImageView imageView2 = (ImageView) objArrI018[9];
                            MyketTextView myketTextView2 = (MyketTextView) objArrI018[2];
                            fz8 fz8Var = new fz8(null, view, frameLayout, imageView, myketTextView, frameLayout2, fastDownloadView, imageView2, myketTextView2, (MyketTextView) objArrI018[7], (MyketTextView) objArrI018[8], (ConstraintLayout) objArrI018[16], (MyketTextView) objArrI018[6], (MyketTextView) objArrI018[5]);
                            fz8Var.H = -1L;
                            fz8Var.v.setTag(null);
                            fz8Var.w.setTag(null);
                            fz8Var.x.setTag(null);
                            fz8Var.y.setTag(null);
                            fz8Var.B.setTag(null);
                            fz8Var.C.setTag(null);
                            fz8Var.D.setTag(null);
                            fz8Var.F.setTag(null);
                            fz8Var.G.setTag(null);
                            fz8Var.l0(view);
                            fz8Var.g0();
                            return fz8Var;
                        case 402:
                            if ("layout/update_empty_list_extension_view_0".equals(tag)) {
                                return new hz8(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for update_empty_list_extension_view is invalid. Received: "));
                        case 403:
                            if (!"layout/update_header_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for update_header is invalid. Received: "));
                            }
                            Object[] objArrI019 = a79.i0(view, 6, null, mz8.A);
                            mz8 mz8Var = new mz8(null, view, (MyketTextView) objArrI019[1], (View) objArrI019[3], (MyketTextView) objArrI019[2], (SmallEmptyLargeTextOvalButton) objArrI019[5]);
                            mz8Var.z = -1L;
                            mz8Var.v.setTag(null);
                            mz8Var.w.setTag(null);
                            ((ConstraintLayout) objArrI019[0]).setTag(null);
                            mz8Var.x.setTag(null);
                            mz8Var.l0(view);
                            mz8Var.g0();
                            return mz8Var;
                        case 404:
                            if ("layout-fa/update_rate_0".equals(tag)) {
                                Object[] objArrI020 = a79.i0(view, 4, null, sz8.A);
                                sz8 sz8Var = new sz8(null, view, (BigTextButton) objArrI020[2], (MyketRatingBar) objArrI020[3], (ConstraintLayout) objArrI020[1]);
                                sz8Var.z = -1L;
                                ((FrameLayout) objArrI020[0]).setTag(null);
                                sz8Var.x.setTag(null);
                                sz8Var.l0(view);
                                sz8Var.g0();
                                return sz8Var;
                            }
                            if (!"layout/update_rate_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for update_rate is invalid. Received: "));
                            }
                            Object[] objArrI021 = a79.i0(view, 4, null, tz8.A);
                            tz8 tz8Var = new tz8(null, view, (BigTextButton) objArrI021[2], (MyketRatingBar) objArrI021[3], (ConstraintLayout) objArrI021[1]);
                            tz8Var.z = -1L;
                            ((FrameLayout) objArrI021[0]).setTag(null);
                            tz8Var.x.setTag(null);
                            tz8Var.l0(view);
                            tz8Var.g0();
                            return tz8Var;
                        case 405:
                            if ("layout/update_toolbar_view_0".equals(tag)) {
                                return new yz8(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for update_toolbar_view is invalid. Received: "));
                        case 406:
                            if ("layout/user_header_info_item_view_0".equals(tag)) {
                                return new a19(new View[]{view});
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for user_header_info_item_view is invalid. Received: "));
                        case 407:
                            if (!"layout/user_horizontal_card_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for user_horizontal_card is invalid. Received: "));
                            }
                            Object[] objArrI022 = a79.i0(view, 7, null, c19.C);
                            c19 c19Var = new c19(null, view, (AvatarImageView) objArrI022[5], (FrameLayout) objArrI022[1], (MyketTextView) objArrI022[3], (MyketTextView) objArrI022[2], (View) objArrI022[4], (UserInfoTagsView) objArrI022[6]);
                            c19Var.B = -1L;
                            c19Var.w.setTag(null);
                            c19Var.x.setTag(null);
                            ((RelativeLayout) objArrI022[0]).setTag(null);
                            c19Var.y.setTag(null);
                            c19Var.l0(view);
                            c19Var.g0();
                            return c19Var;
                        case 408:
                            if ("layout/user_info_tag_view_0".equals(tag)) {
                                return new e19(new View[]{view});
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for user_info_tag_view is invalid. Received: "));
                        case 409:
                            if (!"layout/user_vertical_card_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for user_vertical_card is invalid. Received: "));
                            }
                            Object[] objArrI023 = a79.i0(view, 5, null, a29.A);
                            a29 a29Var = new a29(null, view, (AvatarImageView) objArrI023[4], (FrameLayout) objArrI023[2], (View) objArrI023[3], (MyketTextView) objArrI023[1]);
                            a29Var.z = -1L;
                            a29Var.w.setTag(null);
                            ((ConstraintLayout) objArrI023[0]).setTag(null);
                            a29Var.y.setTag(null);
                            a29Var.l0(view);
                            a29Var.g0();
                            return a29Var;
                        case 410:
                            if (!"layout/vertical_line_view_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for vertical_line_view is invalid. Received: "));
                            }
                            w49 w49Var = new w49(null, view, (View) a79.i0(view, 1, null, null)[0]);
                            w49Var.w = -1L;
                            w49Var.v.setTag(null);
                            w49Var.l0(view);
                            w49Var.g0();
                            return w49Var;
                        case 411:
                            if (!"layout/video_view_controller_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for video_view_controller is invalid. Received: "));
                            }
                            Object[] objArrI024 = a79.i0(view, 6, null, a69.C);
                            a69 a69Var = new a69(null, view, (View) objArrI024[1], (ConstraintLayout) objArrI024[0], (DefaultTimeBar) objArrI024[5], (ImageView) objArrI024[4], (ImageView) objArrI024[3], (View) objArrI024[2]);
                            a69Var.B = -1L;
                            a69Var.w.setTag(null);
                            a69Var.l0(view);
                            a69Var.g0();
                            return a69Var;
                        case 412:
                            if ("layout/view_custom_list_search_0".equals(tag)) {
                                return new x69(new View[]{view});
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for view_custom_list_search is invalid. Received: "));
                        case 413:
                            if (!"layout/view_login_info_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for view_login_info is invalid. Received: "));
                            }
                            Object[] objArrI025 = a79.i0(view, 9, null, i79.E);
                            AppIconView appIconView = (AppIconView) objArrI025[5];
                            PaymentPriceView paymentPriceView = (PaymentPriceView) objArrI025[6];
                            MyketTextView myketTextView3 = (MyketTextView) objArrI025[1];
                            i79 i79Var = new i79(null, view, appIconView, paymentPriceView, myketTextView3, (MyketTextView) objArrI025[3], (ImageView) objArrI025[7], (MyketTextView) objArrI025[4], (MyketTextView) objArrI025[2]);
                            i79Var.D = -1L;
                            i79Var.x.setTag(null);
                            i79Var.y.setTag(null);
                            ((ConstraintLayout) objArrI025[0]).setTag(null);
                            i79Var.A.setTag(null);
                            i79Var.B.setTag(null);
                            i79Var.l0(view);
                            i79Var.g0();
                            return i79Var;
                        case 414:
                            if (!"layout/view_menu_more_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for view_menu_more is invalid. Received: "));
                            }
                            Object[] objArrI026 = a79.i0(view, 2, null, null);
                            j79 j79Var = new j79(null, view, (ImageView) objArrI026[1]);
                            j79Var.w = -1L;
                            ((ConstraintLayout) objArrI026[0]).setTag(null);
                            j79Var.v.setTag(null);
                            j79Var.l0(view);
                            j79Var.g0();
                            return j79Var;
                        case 415:
                            if ("layout/view_movie_download_button_0".equals(tag)) {
                                return new y79(new View[]{view});
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for view_movie_download_button is invalid. Received: "));
                        case 416:
                            if ("layout/view_payment_price_0".equals(tag)) {
                                return new s89(new View[]{view});
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for view_payment_price is invalid. Received: "));
                        case 417:
                            if ("layout/view_profile_tabs_0".equals(tag)) {
                                return new u89(new View[]{view});
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for view_profile_tabs is invalid. Received: "));
                        case 418:
                            if (!"layout/view_progress_button_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for view_progress_button is invalid. Received: "));
                            }
                            Object[] objArrI027 = a79.i0(view, 6, null, w89.C);
                            w89 w89Var = new w89(null, view, (LottieAnimationView) objArrI027[2], (LinearLayout) objArrI027[1], (MyketTextView) objArrI027[3], (LoadingView) objArrI027[5], (MyketTextView) objArrI027[4]);
                            w89Var.B = -1L;
                            ((FrameLayout) objArrI027[0]).setTag(null);
                            w89Var.l0(view);
                            w89Var.g0();
                            return w89Var;
                        case 419:
                            if ("layout/view_series_background_0".equals(tag)) {
                                return new a99(new View[]{view});
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for view_series_background is invalid. Received: "));
                        case 420:
                            if (!"layout/virtual_keyboard_item_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for virtual_keyboard_item is invalid. Received: "));
                            }
                            ka9 ka9Var = new ka9(null, view, (MyketTextView) a79.i0(view, 1, null, null)[0]);
                            ka9Var.w = -1L;
                            ka9Var.v.setTag(null);
                            view.setTag(as6.dataBinding, ka9Var);
                            ka9Var.g0();
                            return ka9Var;
                        case 421:
                            if (!"layout/virtual_keyboard_layout_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for virtual_keyboard_layout is invalid. Received: "));
                            }
                            Object[] objArrI028 = a79.i0(view, 3, null, na9.z);
                            na9 na9Var = new na9(null, view, (RecyclerView) objArrI028[2], (MyketTextView) objArrI028[1]);
                            na9Var.y = -1L;
                            ((ConstraintLayout) objArrI028[0]).setTag(null);
                            na9Var.w.setTag(null);
                            na9Var.l0(view);
                            na9Var.g0();
                            return na9Var;
                        case 422:
                            if (!"layout/virtual_keyboard_remove_0".equals(tag)) {
                                throw new IllegalArgumentException(o40.x(tag, "The tag for virtual_keyboard_remove is invalid. Received: "));
                            }
                            Object[] objArrI029 = a79.i0(view, 2, null, pa9.y);
                            pa9 pa9Var = new pa9(null, view, (ImageView) objArrI029[1], (FrameLayout) objArrI029[0]);
                            pa9Var.x = -1L;
                            pa9Var.w.setTag(null);
                            view.setTag(as6.dataBinding, pa9Var);
                            pa9Var.g0();
                            return pa9Var;
                        case 423:
                            if ("layout/vpn_service_snackbar_0".equals(tag)) {
                                return new ob9(view);
                            }
                            throw new IllegalArgumentException(o40.x(tag, "The tag for vpn_service_snackbar is invalid. Received: "));
                    }
            }
        }
        return null;
    }

    @Override // defpackage.ba1
    public final a79 c(int i, View[] viewArr) {
        int i2;
        if (viewArr.length == 0 || (i2 = a.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 26) {
            if ("layout/app_summery_view_0".equals(tag)) {
                return new ut(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for app_summery_view is invalid. Received: "));
        }
        if (i2 == 36) {
            if ("layout/buttons_dialog_component_0".equals(tag)) {
                return new ki0(1, viewArr);
            }
            if ("layout-fa/buttons_dialog_component_0".equals(tag)) {
                return new ki0(0, viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for buttons_dialog_component is invalid. Received: "));
        }
        if (i2 == 269) {
            if ("layout/mini_player_view_0".equals(tag)) {
                return new xv4(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for mini_player_view is invalid. Received: "));
        }
        if (i2 == 303) {
            if ("layout/myket_recent_download_view_0".equals(tag)) {
                return new df5(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for myket_recent_download_view is invalid. Received: "));
        }
        if (i2 == 305) {
            if ("layout/myket_star_0".equals(tag)) {
                return new lf5(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for myket_star is invalid. Received: "));
        }
        if (i2 == 399) {
            if ("layout/trailer_finished_playing_view_0".equals(tag)) {
                return new yp8(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for trailer_finished_playing_view is invalid. Received: "));
        }
        if (i2 == 406) {
            if ("layout/user_header_info_item_view_0".equals(tag)) {
                return new a19(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for user_header_info_item_view is invalid. Received: "));
        }
        if (i2 == 408) {
            if ("layout/user_info_tag_view_0".equals(tag)) {
                return new e19(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for user_info_tag_view is invalid. Received: "));
        }
        if (i2 == 412) {
            if ("layout/view_custom_list_search_0".equals(tag)) {
                return new x69(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for view_custom_list_search is invalid. Received: "));
        }
        if (i2 == 419) {
            if ("layout/view_series_background_0".equals(tag)) {
                return new a99(viewArr);
            }
            throw new IllegalArgumentException(o40.x(tag, "The tag for view_series_background is invalid. Received: "));
        }
        switch (i2) {
            case 415:
                if ("layout/view_movie_download_button_0".equals(tag)) {
                    return new y79(viewArr);
                }
                throw new IllegalArgumentException(o40.x(tag, "The tag for view_movie_download_button is invalid. Received: "));
            case 416:
                if ("layout/view_payment_price_0".equals(tag)) {
                    return new s89(viewArr);
                }
                throw new IllegalArgumentException(o40.x(tag, "The tag for view_payment_price is invalid. Received: "));
            case 417:
                if ("layout/view_profile_tabs_0".equals(tag)) {
                    return new u89(viewArr);
                }
                throw new IllegalArgumentException(o40.x(tag, "The tag for view_profile_tabs is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // defpackage.ba1
    public final int d(String str) {
        Integer num = (Integer) ca1.a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
