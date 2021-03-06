/**
 * Copyright (C) 2016-2018 Harald Kuhn
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package rocks.bottery.connector;

import rocks.bottery.bot.IParticipant;

/**
 * A basic implementation independent of a connector
 * 
 * @author Harald Kuhn
 */
public class GenericParticipant implements IParticipant {

	private String id;
	private String name;
	private String channel;
	private String address;

	public GenericParticipant() {
		super();
	}

	public GenericParticipant(String id, String name, String channel) {
		this();
		this.id = id;
		this.name = name;
		this.channel = channel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sylvani.bot.IParticipant#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sylvani.bot.IParticipant#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sylvani.bot.IParticipant#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sylvani.bot.IParticipant#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getChannel() {
		return "discord";
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public Object getConnectorParticipant() {
		return this;
	}

	@Override
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
