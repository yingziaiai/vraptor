/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource - guilherme.silveira@caelum.com.br
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.caelum.vraptor.util.extjs;

import br.com.caelum.vraptor.View;

/**
 * Interface for json serialization in ExtJS standard
 *
 * @author Daniel Kist
 */
public interface ExtJSJson extends View {

	public ExtJSJson from(Object object);

	public ExtJSJson success();

	public ExtJSJson success(boolean success);

	public ExtJSJson selected(Object value);

	public ExtJSJson exclude(String... names);

	public ExtJSJson include(String... fields);

	public ExtJSJson serialize();

	public ExtJSJson total(Integer total);
	
}
