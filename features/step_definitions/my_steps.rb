class String
  def normalize_spaces
    self.squeeze(" ").strip
  end
end

When(/^I view my bill$/) do
  visit "http://127.0.0.1:4567/bill"
end


Then(/^I should see:$/) do |table|
  list = table.raw.flatten.collect { |n| n.normalize_spaces }
  body = page.find("body").text().normalize_spaces
  list.each do |item|
    expect(body).to include(item)
  end
end

When(/^I view my bill as json$/) do
  visit "http://127.0.0.1:4567/bill.json"
end

And(/^I wait$/) do
  sleep 1000
end