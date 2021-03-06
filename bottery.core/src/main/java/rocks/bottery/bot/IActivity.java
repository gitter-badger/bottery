/**
 * Copyright (C) 2016-2017 Harald Kuhn
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
package rocks.bottery.bot;

import java.util.List;

/**
 * Defines an activity in a chat
 * 
 * Activities are of a type (like message, a state change or anything else)
 * 
 * Most connectors will implement their own Activity as a wrapper around the connector message / activity object
 * 
 * {@link #getConnectorActivity()} exposes the original object with must be cast to the corresponding type
 * 
 * Most fields are optional and dependant on the backing system
 * 
 * @author Harald Kuhn
 *
 */
public interface IActivity {

	/**
	 * the id of the activity or null if no id is available
	 * 
	 * @return
	 */
	String getId();

	/**
	 * set the ID
	 * 
	 * @param id
	 */
	void setId(String id);

	/**
	 * get the Topic of the activity or null if no topic is present or supported
	 * 
	 * @return topic string or null
	 */
	String getTopic();

	/**
	 * set the Topic of the activity or null if no topic is present or supported
	 * 
	 * @return
	 */
	void setTopic(String topic);

	/**
	 * the type of the activity
	 * 
	 * @return
	 */
	ActivityType getType();

	void setType(ActivityType type);

	/**
	 * the sending participant
	 * 
	 * @return
	 */
	IParticipant getFrom();

	void setFrom(IParticipant from);

	IParticipant getRecipient();

	void setRecipient(IParticipant recipient);

	/**
	 * the text of the activity or null if none is present
	 * 
	 * @return
	 */
	public String getText();

	public void setText(String text);

	/**
	 * the conversation (aka the chat or session of the connector)
	 * 
	 * @return
	 */
	public IConversation getConversation();

	public void setConversation(IConversation conversation);

	/**
	 * a list of attachements or null if none are available
	 * 
	 * @param attachement
	 */
	public void setAttachments(List<IAttachment> attachement);

	public List<IAttachment> getAttachments();

	/**
	 * Get the connector (can be used to access connector specific features)
	 * 
	 * @return
	 */
	public Object getConnectorActivity();

	/**
	 * get the Intent the recognizer detected (may be null)
	 * 
	 * @return
	 */
	public IIntent getIntent();

	public void setIntent(IIntent intent);

	/**
	 * a list of choices to be presented to the user the actual presentation is dependent of the technological
	 * possiblities of the connector
	 */
	public void setChoices(List<Choice<?>> choices);

	/**
	 * 
	 */
	public List<Choice<?>> getChoices();

}