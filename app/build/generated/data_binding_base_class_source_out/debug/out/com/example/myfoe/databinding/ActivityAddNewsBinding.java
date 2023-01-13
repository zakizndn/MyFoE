// Generated by view binder compiler. Do not edit!
package com.example.myfoe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfoe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddNewsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button AddNow;

  @NonNull
  public final EditText Date;

  @NonNull
  public final EditText Detail;

  @NonNull
  public final EditText Time;

  @NonNull
  public final EditText Title;

  @NonNull
  public final EditText Venue;

  @NonNull
  public final ImageView logo;

  private ActivityAddNewsBinding(@NonNull ConstraintLayout rootView, @NonNull Button AddNow,
      @NonNull EditText Date, @NonNull EditText Detail, @NonNull EditText Time,
      @NonNull EditText Title, @NonNull EditText Venue, @NonNull ImageView logo) {
    this.rootView = rootView;
    this.AddNow = AddNow;
    this.Date = Date;
    this.Detail = Detail;
    this.Time = Time;
    this.Title = Title;
    this.Venue = Venue;
    this.logo = logo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddNewsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_news, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddNewsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AddNow;
      Button AddNow = ViewBindings.findChildViewById(rootView, id);
      if (AddNow == null) {
        break missingId;
      }

      id = R.id.Date;
      EditText Date = ViewBindings.findChildViewById(rootView, id);
      if (Date == null) {
        break missingId;
      }

      id = R.id.Detail;
      EditText Detail = ViewBindings.findChildViewById(rootView, id);
      if (Detail == null) {
        break missingId;
      }

      id = R.id.Time;
      EditText Time = ViewBindings.findChildViewById(rootView, id);
      if (Time == null) {
        break missingId;
      }

      id = R.id.Title;
      EditText Title = ViewBindings.findChildViewById(rootView, id);
      if (Title == null) {
        break missingId;
      }

      id = R.id.Venue;
      EditText Venue = ViewBindings.findChildViewById(rootView, id);
      if (Venue == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      return new ActivityAddNewsBinding((ConstraintLayout) rootView, AddNow, Date, Detail, Time,
          Title, Venue, logo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}