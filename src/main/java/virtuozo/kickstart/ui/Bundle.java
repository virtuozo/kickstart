/**
 * Copyright (C) 2004-2014 the original author or authors. See the notice.md file distributed with
 * this work for additional information regarding copyright ownership.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package virtuozo.kickstart.ui;

import virtuozo.showcase.i18n.Constants;
import virtuozo.showcase.i18n.Messages;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public class Bundle {
  private static final Images images = GWT.create(Images.class);
  
  private static final Constants constants = GWT.create(Constants.class);
  
  private static final Messages messages = GWT.create(Messages.class);
  
  public static Constants constants() {
    return constants;
  }
  
  public static Messages messages() {
    return messages;
  }
  
  public static Images images(){
    return Bundle.images;
  }
  
  public static interface Images extends ClientBundle{
    @Source("hitz/virtuozo/kickstart/images/logo.jpg")
    ImageResource logo();
  }
}